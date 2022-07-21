package com.ispan.group3.service;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ispan.group3.repository.Ticket;
import com.ispan.group3.repository.TicketRepository;


@Service
@Transactional
public class TicketService{

	@Autowired
	private TicketRepository TicketRepository;

	/**
	 * 查詢所有的列表
	 * 
	 * @return
	 */
	public List<Ticket> findAll() {
		return TicketRepository.findAll();
	}
	
	/**
	 * 查詢分頁內的所有清單
	 */
	public Page<Ticket> findAllByPage(Pageable pageable){
//		排列:最新數據在上
//		PageRequest pageable = PageRequest.of(0,5, Sort.Direction.DESC,"id");
		return TicketRepository.findAll(pageable);
	}

public Page<Ticket> findAllByCityAndTagNo(String tagNo,String city, Pageable pageable) { 
		
		Page<Ticket> rtnListTicket = TicketRepository.findAll(pageable);
		
		if(tagNo==null &&  city == null) {//全查詢
			rtnListTicket = TicketRepository.findAll(pageable);	
			System.err.println("findAll");
		}
		if(tagNo!=null &&  city != null) {
			rtnListTicket = TicketRepository.findByTagNoAndCity(tagNo,city,pageable);
			System.err.println("findByTagNoAndCity");
		}
		if(tagNo!=null &&  city == null) {
			rtnListTicket = TicketRepository.findByTagNo(tagNo,pageable);	
			System.err.println("findByTagNo");
		}
		if(tagNo==null &&  city != null) {//
			rtnListTicket = TicketRepository.findByCity(city,pageable);
			System.err.println("findByCity");
		}
		
		for(Ticket ticket : rtnListTicket) {
		    String FristOnePath = ""; 
		    for(String imagePath : ticket.getImages()) {
		    	if(imagePath.compareTo(FristOnePath) > 0) {
		    		FristOnePath = imagePath;
		    	}
		    }
			byte[] fileContent; 
			try {	
				//System.out.println("dir-->"+System.getProperty("user.dir"));
				//TripBoot/src/main/resources/static/data/uploadimages/ticket/Xpark_1.jpg
				fileContent = FileUtils.readFileToByteArray(new File(System.getProperty("user.dir")+"/src/main/resources/static/"+FristOnePath));
				String encodedString = Base64.getEncoder().encodeToString(fileContent);
				ticket.setTicketImageData(encodedString);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return rtnListTicket;
	}
	
	
	
	/**
	 * 新增清單列表
	 * 
	 * @param Ticket
	 * @return
	 */
	public Ticket save(Ticket Ticket) {
		return TicketRepository.save(Ticket);
	}

	/**
	 * 獲取一條信息
	 * 
	 * @param id
	 * @return
	 */

	public Optional<Ticket> findById(long ticketNo) {
		return TicketRepository.findById(ticketNo);
	}

	/**
	 * 删除一條信息
	 * @param id
	 */
	public void deleteById(long ticketNo) {
		TicketRepository.deleteById(ticketNo);
	}



	public Ticket getBookById(long ticketNo) {
		return TicketRepository.findById(ticketNo).orElse(null);
	}
	
	 public List<Ticket> findByCompanyId(long companyId){
		 return TicketRepository.findByCompanyId(companyId);
	 }
	
}
