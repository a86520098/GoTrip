package com.ispan.group3.controller;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.ServletContext;
import javax.sql.rowset.serial.SerialBlob;

import com.ispan.group3.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

import com.ispan.group3.repository.Hotel;

@Controller
@RequestMapping("/hotel")
public class HotelController {
	
	HotelService hotelService;
	ServletContext context;
	@Autowired
	public HotelController(HotelService hotelService, ServletContext context) {
		this.hotelService = hotelService;
		this.context = context;
	}

	@GetMapping("/hotel123")
		public  String inDex(Model m) {
		Model kkk = m.addAttribute("Hotel", hotelService.findAll());
		System.out.println( "get Data from MySQl "+kkk);
		System.out.println("Help you find out all,Thank God!^^");
			return "backend/hotel/hotelIndex";
		}
	
	
	
	@GetMapping("/showForm")
		public String showNewForm(Model m ){
		m.addAttribute("hotel", new Hotel());
		System.out.println("This is success transfer to new form");
		return "backend/hotel/hotelNewAdd";
	}
	
	@PostMapping(value = "/addHotel")
	public String insert(
		@ModelAttribute("hotel")Hotel hotels,BindingResult result) {
		System.out.println("準備新增接收資料了");
		MultipartFile picture = hotels.getProductImage();
		String originalFilename = picture.getOriginalFilename();
		if (originalFilename.length() > 0 && originalFilename.lastIndexOf(".") > -1) {
			hotels.setFileName(originalFilename);
		}

		// 建立Blob物件，交由 Hibernate 寫入資料庫
		if (picture != null && !picture.isEmpty()) {
			try {
				byte[] b = picture.getBytes();
				Blob blob = new SerialBlob(b);
				hotels.setImage(blob);
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("檔案上傳發生異常: " + e.getMessage());
			}
		}
//		

		Timestamp adminTime = new Timestamp(System.currentTimeMillis());
		hotels.setAdmissionTime(adminTime);
		
		try {
			hotelService.save(hotels);
		} catch (org.hibernate.exception.ConstraintViolationException e) {
			result.rejectValue("account", "", "帳號已存在，請重新輸入");
			return "user-form";
		} catch (Exception ex) {
			System.out.println(ex.getClass().getName() + ", ex.getMessage()=" + ex.getMessage());
			result.rejectValue("account", "", "請通知系統人員...");
			return "user-form";
		}
		System.out.println("222此方法儲存");
		return "redirect:/hotel/hotel123";
	}
@GetMapping("/picture")
public ResponseEntity<byte[]> getPicture(@RequestParam("id") Integer id) {
	byte[] body = null;
	ResponseEntity<byte[]> re = null;
	MediaType mediaType = null;
	HttpHeaders headers = new HttpHeaders();
	headers.setCacheControl(CacheControl.noCache().getHeaderValue());

	Hotel hotelPhoto = hotelService.findById(id);
	if (hotelPhoto == null) {
		return new ResponseEntity<byte[]>(HttpStatus.NOT_FOUND);
	}


	String filename = hotelPhoto.getFileName();
	if (filename != null) {
		if (filename.toLowerCase().endsWith("jfif")) {
			mediaType = MediaType.valueOf(context.getMimeType("dummy.jpeg"));
		} else {
			mediaType = MediaType.valueOf(context.getMimeType(filename));
			headers.setContentType(mediaType);
		}
	}
	Blob blob = hotelPhoto.getImage();

	try {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		InputStream is = blob.getBinaryStream();
		byte[] b = new byte[81920];
		int len = 0;
		while ((len = is.read(b)) != -1) {
			baos.write(b, 0, len);
		}
		headers.setContentType(mediaType);
		headers.setCacheControl(CacheControl.noCache().getHeaderValue());
		re = new ResponseEntity<byte[]>(baos.toByteArray(), headers, HttpStatus.OK);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return re;
}




		
		
			
		
		@GetMapping(value="/delete/{id}")
		public String deleteHotel(@PathVariable Integer id){
		hotelService.delete(id);
			for (int i = 0; i <5; i++) {
				System.out.println("已經幫你把"+id+"刪除了");
			}

			return "redirect:/hotel/hotel123";
		}
		
		
		
		@RequestMapping(path = "/editForm/{id}",method = RequestMethod.GET)
		public String showEditForm(@PathVariable("id")Integer update, Model m ){
		m.addAttribute("hotel", hotelService.findById(update) );
		System.out.println("This is success transfer to Edit form");
			return "backend/hotel/hotelEditForm";
		}
		
		
	
		
		
		
		@RequestMapping(path = "/editHotel",method = RequestMethod.POST)
		public String update(
				@ModelAttribute("hotel")Hotel hotels,
				BindingResult result,Model model) {
			System.out.println("準備更新資料了");
			Timestamp adminTime = new Timestamp(System.currentTimeMillis());
			hotels.setAdmissionTime(adminTime);

			MultipartFile picture = hotels.getProductImage();

			if (picture.getSize() == 0) {
				// 表示使用者並未挑選圖片
			} else {
				String originalFilename = picture.getOriginalFilename();
				if (originalFilename.length() > 0 && originalFilename.lastIndexOf(".") > -1) {
					hotels.setFileName(originalFilename);
				}

				// 建立Blob物件
				if (picture != null && !picture.isEmpty()) {
					try {
						byte[] b = picture.getBytes();
						Blob blob = new SerialBlob(b);
						hotels.setImage(blob);
					} catch (Exception e) {
						e.printStackTrace();
						throw new RuntimeException("檔案上傳發生異常: " + e.getMessage());
					}
				}
			}
			hotelService.save(hotels);
			return "redirect:/hotel/hotel123";
		}

	@RequestMapping(path = "/enterPic",method = RequestMethod.GET)
	public String intoPicture(@RequestParam("id")Integer pictureID, Model m ){
		m.addAttribute("hotel", hotelService.findById(pictureID) );
		System.out.println("This is success transfer to Edit form");
		return "backend/hotel/intoPicture";
	}
	@GetMapping("/tohotelDetail")
	public String toHotelDetail(@RequestParam("id")Integer id , Model m) {
		m.addAttribute("roomDetail",hotelService.findById(id));
		return "frontend/hotel-roomDetail";
	}


		
	@GetMapping("/api/hotels")
	@ResponseBody
	public List<Hotel> getHotels() {
		return hotelService.findAll();
	}
	
	@GetMapping("/api/hotels/{id}")
	@ResponseBody
	public Hotel getHotel(@PathVariable Integer id) {
		return hotelService.findById(id);
	}

	@GetMapping("/findHotelList")
	public String findHotelList( Model m) {
		m.addAttribute("roomList",hotelService.findAll());
		return "frontend/hotel-roomList";
	}




		
		
		
}
