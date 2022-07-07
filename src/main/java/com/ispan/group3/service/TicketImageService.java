package com.ispan.group3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ispan.group3.repository.TicketImage;
import com.ispan.group3.repository.TicketImageRepository;


@Service
@Transactional
public class TicketImageService{

	@Autowired
	private TicketImageRepository ticketImageRepository;

	/**
	 * 查詢所有的列表
	 * 
	 * @return
	 */
	public List<TicketImage> getImages(Long id) {
		return ticketImageRepository.findByImages(id);
	}
	
	/**
	 * 新增清單列表
	 * 
	 * @param Ticket
	 * @return
	 */
	public TicketImage save(TicketImage ticketImage) {
		return ticketImageRepository.save(ticketImage);
	}
	/**
	 * 删除一條信息
	 * @param id
	 */
	public void deleteById(long ticketNo) {
		ticketImageRepository.deleteById(ticketNo);
	}

//	@Override
//	public Optional<Book> findById(Long id) {
//		return bookRepository.findById(id).orElse(null);
//	}

}
