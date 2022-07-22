package com.ispan.group3.controller;

import com.ispan.group3.repository.Hotel;
import com.ispan.group3.repository.HotelImage;
import com.ispan.group3.repository.HotelRoom;
import com.ispan.group3.repository.HotelRoomImage;
import com.ispan.group3.service.HotelRoomService;
import com.ispan.group3.service.HotelService;
import com.ispan.group3.util.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.sql.rowset.serial.SerialBlob;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Controller

public class HotelController {

    HotelService hotelService;
    HotelRoomService hotelroomService;
    ServletContext context;

    @Autowired
    public HotelController(HotelService hotelService, HotelRoomService hotelroomService, ServletContext context) {
        this.hotelService = hotelService;
        this.hotelroomService = hotelroomService;
        this.context = context;
    }

    //    進入首頁
    @GetMapping("/backHotel")
    public String inDex(Model m) {
        Model kkk = m.addAttribute("Hotel", hotelService.findAll());
        System.out.println("get Data from MySQl " + kkk);
        System.out.println("Help you find out all,Thank God!^^");
        return "backend/hotel/hotelIndex";
    }

    //負責新增
    @GetMapping("/showForm")
    public String showNewForm(Model m) {
        m.addAttribute("hotel", new Hotel());
        System.out.println("This is success transfer to new form");
        return "backend/hotel/hotelNewAdd";
    }

    @PostMapping(value = "/addHotel")
    public String insert(@ModelAttribute("hotel") Hotel hotels, BindingResult result,
                         @RequestParam(value = "imagefile", required = false) List<MultipartFile> files
    ) {
        System.out.println("準備新增接收資料了");
//        MultipartFile picture = hotels.getProductImage(); //拿照片
//        String originalFilename = picture.getOriginalFilename(); //拿檔案名稱
//        Timestamp adminTime = new Timestamp(System.currentTimeMillis()); //拿檔案接受到的當下時間
//        hotels.setAdmissionTime(adminTime); //塞進去

        List<HotelImage> images = new ArrayList<>();
        for (MultipartFile file : files) {
            try {
                String savePath = FileUploadUtil.saveFile("hotelImage", file);
                HotelImage hotelImage = new HotelImage(savePath, hotels);
                images.add(hotelImage);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        hotels.setImages(images);
        hotelService.save(hotels);

        System.out.println("222此方法儲存");
        return "redirect:/backHotel";
    }


    //負責新增

    //負責秀出資料庫二位元的照片
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

    //後台刪除
    @GetMapping(value = "/delete/{id}")
    public String deleteHotel(@PathVariable Integer id) {
        hotelService.delete(id);
        for (int i = 0; i < 5; i++) {
            System.out.println("已經幫你把" + id + "刪除了");
        }

        return "redirect:/backHotel";
    }

    //    負責編輯的頁面
    @RequestMapping(path = "/showEdit", method = RequestMethod.GET)
    public String showEditForm(@RequestParam("id") Integer update, Model m) {
        m.addAttribute("hotel", hotelService.findById(update));
        System.out.println("This is success transfer to Edit form");
        return "backend/hotel/hotelEditForm";
    }


    @RequestMapping(path = "/editHotel", method = RequestMethod.POST)
    public String update(
            @ModelAttribute("hotel") Hotel hotels,
            BindingResult result, Model model) {
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
        return "redirect:/backHotel";
    }


    //    測試照片帶值
    @RequestMapping(path = "/enterPic", method = RequestMethod.GET)
    public String intoPicture(@RequestParam("id") Integer pictureID, Model m) {
        m.addAttribute("hotel", hotelService.findById(pictureID));
        System.out.println("This is success transfer to Edit form");
        return "backend/hotel/intoPicture";
    }


    //    以上後端


    //    以下前端的後台
//    負責房間詳細資料
    @GetMapping("/tohotelDetail")
    public String toHotelDetail(@RequestParam("id") Integer id, Model m) {
        m.addAttribute("roomDetail", hotelService.findById(id));
        m.addAttribute("room", hotelroomService.findAllHotelRoom(id));
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

    //    所有住宿列表
    @GetMapping("/findHotelList")
    public String findHotelList(Model m) {
        m.addAttribute("hotel", hotelService.findAll());
        return "frontend/hotel-hotelList2";
    }


    @GetMapping("/toHotelIndex")
    public String toHotelIndex() {
        return "frontend/hotel-Index";
    }

    //    負責地圖
    @GetMapping("/goGoogleMap")
    public String togoGoogleMap(Model m, @RequestParam("id") Integer id) {
        m.addAttribute("roomDetail", hotelService.findById(id));
        return "/frontend/hotel-Google";
    }

    //    前台負責新增頁面
    @GetMapping("/showFHotelNew")
    public String toHotelNewF(Model m) {
        m.addAttribute("hotel", new Hotel());
        System.out.println("going to front hotelNew page");
        return "/frontend/hotelAddNewF";
    }

    // ======== 前台商家系統 ========

    //前-後台主頁面
    @GetMapping("/vendor/hotels")
    public String findByCompany(Model model) {
//        model.addAttribute("hotel", hotelService.findByCompany(companyId));
        model.addAttribute("hotel", hotelService.findAll());
        return "/frontend/hotel/hotel-index";
    }

    @GetMapping("/addHotelRoom")
    public String showNewRoom(Model model, @RequestParam("id") Integer id) {
        System.out.println("I get the id from hotel " + id + " is hotel id ");
        HotelRoom hotelRoom = new HotelRoom();
        Hotel byId = hotelService.findById(id);
        model.addAttribute("mainHotel", byId);
        model.addAttribute("hotelroom", hotelRoom);
        return "/frontend/hotel/hotel-newRoom";
    }


    @PostMapping("/getNewRoom/{id}")
    public String getNewRoom(@ModelAttribute("hotelroom") HotelRoom hotelRoom,
                             @RequestParam(value = "imagefile", required = false) List<MultipartFile> files,
                             @PathVariable("id") Integer id
    ) {
        Hotel byId = hotelService.findById(id);
        List<HotelRoomImage> imagesLish = new ArrayList<>();
        for (MultipartFile file : files) {
            try {
                String savePath = FileUploadUtil.saveFile("hotelroomImage", file);
                HotelRoomImage hotelRoomImage = new HotelRoomImage(savePath, hotelRoom);
                imagesLish.add(hotelRoomImage);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        hotelRoom.setHotelRoomImageList(imagesLish);
        for (int i = 0; i < 10; i++) {
            System.out.println("看到我代表是更新" + byId.getId());

        }


        hotelRoom.setHotel(byId);
        hotelroomService.save(hotelRoom);
        for (int i = 0; i < 10; i++) {
            System.out.println("前台商家新增房間");
        }
        return "redirect:/vendor/hotels";
    }

    @GetMapping("getHotelRoomList")
    public String getAllHotelRoom(Model model, @RequestParam("id") Integer id) {
        System.out.println("Get All RoomList");
        model.addAttribute("roomList", hotelroomService.findAllHotelRoom(id));
        return "/frontend/hotel/hotel-roomList";
    }

    @GetMapping("/deleteRoom")
    public String DeleteRoom(Model model, @RequestParam("id") Integer id) {
        hotelroomService.deleteById(id);
        System.out.println("已經成功刪除房間刪除代號為=" + id);
        return "redirect:/backend/index";
    }

    @GetMapping("/updateRoom")
    public String UpdataRoom(Model model, @RequestParam("id") Integer id) {
        model.addAttribute("update", hotelroomService.findByid(id));
        return "/frontend/hotel/hotel-EditRoom";
    }

    @PostMapping("/EditRoom")
    public String getEditRoom(@ModelAttribute("hotelroom") HotelRoom hotelRoom,
                              @RequestParam(value = "imagefile", required = false) List<MultipartFile> efiles
    ) {
        List<HotelRoomImage> imagesLish = new ArrayList<>();
        for (MultipartFile file : efiles) {
            try {
                String savePath = FileUploadUtil.saveFile("hotelroomImage", file);
                HotelRoomImage hotelRoomImage = new HotelRoomImage(savePath, hotelRoom);
                imagesLish.add(hotelRoomImage);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        hotelRoom.setHotelRoomImageList(imagesLish);

        hotelroomService.save(hotelRoom);
        System.out.println("看到這條代表更新成功");
        return "redirect:/backend/index";
    }

    @GetMapping("/vendor/newHotel")
    public String NewHotel(Model model) {
        model.addAttribute("hotel", new Hotel());
        return "/frontend/hotel/NewHotel-form";
    }

    @GetMapping("/vendor/EditRoom")
    public String EditHotel(Model model, @RequestParam("id") Integer id) {
        model.addAttribute("hotel", hotelService.findById(id));
        return "/frontend/hotel/EditHotel-form";
    }

    @GetMapping("/frontDelete")
    public String frontDelete(@RequestParam("id") Integer id) {
        hotelService.delete(id);
        System.out.println("已經刪除飯店 刪除號碼為:=" + id);
        return "redirect:/vendor/hotels";
    }

    @PostMapping(value = "/frontNewHotel")
    public String frontHotel(@ModelAttribute("hotel") Hotel hotels, BindingResult result,
                             @RequestParam(value = "imagefile", required = false) List<MultipartFile> files
    ) {
        System.out.println("準備新增接收資料了");
//        MultipartFile picture = hotels.getProductImage(); //拿照片
//        String originalFilename = picture.getOriginalFilename(); //拿檔案名稱
//        Timestamp adminTime = new Timestamp(System.currentTimeMillis()); //拿檔案接受到的當下時間
//        hotels.setAdmissionTime(adminTime); //塞進去

        List<HotelImage> images = new ArrayList<>();
        for (MultipartFile file : files) {
            try {
                String savePath = FileUploadUtil.saveFile("hotelImage", file);
                HotelImage hotelImage = new HotelImage(savePath, hotels);
                images.add(hotelImage);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        hotels.setImages(images);
        hotelService.save(hotels);

        System.out.println("222此方法儲存");
        return "redirect:/vendor/hotels";
    }

    @PostMapping(value = "/frontEditHotel")
    public String frontEditHotel(@ModelAttribute("hotel") Hotel hotels, BindingResult result,
                                 @RequestParam(value = "imagefile", required = false) List<MultipartFile> files
    ) {
        System.out.println("準備新增接收資料了");
//        MultipartFile picture = hotels.getProductImage(); //拿照片
//        String originalFilename = picture.getOriginalFilename(); //拿檔案名稱
//        Timestamp adminTime = new Timestamp(System.currentTimeMillis()); //拿檔案接受到的當下時間
//        hotels.setAdmissionTime(adminTime); //塞進去

        List<HotelImage> images = new ArrayList<>();
        for (MultipartFile file : files) {
            try {
                String savePath = FileUploadUtil.saveFile("hotelImage", file);
                HotelImage hotelImage = new HotelImage(savePath, hotels);
                images.add(hotelImage);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        hotels.setImages(images);
        hotelService.save(hotels);

        System.out.println("222此方法儲存");
        return "redirect:/vendor/hotels";
    }


}