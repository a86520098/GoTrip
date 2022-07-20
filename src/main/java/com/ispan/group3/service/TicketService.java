package com.ispan.group3.service;

import java.util.List;
import java.util.Optional;
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
	
}
