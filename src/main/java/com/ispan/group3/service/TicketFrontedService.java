//package com.ispan.group3.service;
//
//import java.util.List;
//import java.util.Optional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import com.ispan.group3.repository.TicketFronted;
//import com.ispan.group3.repository.TicketFrontedRepository;
//
//
//@Service
//@Transactional
//public class TicketFrontedService{
//
//	@Autowired
//	private TicketFrontedRepository TicketFrontedRepository;
//
//	/**
//	 * 查詢所有的列表
//	 * 
//	 * @return
//	 */
//	public List<TicketFronted> findAll() {
//		return TicketFrontedRepository.findAll();
//	}
//	
//	/**
//	 * 查詢分頁內的所有清單
//	 */
//	public Page<TicketFronted> findAllByPage(Pageable pageable){
////		排列:最新數據在上
////		PageRequest pageable = PageRequest.of(0,5, Sort.Direction.DESC,"id");
//		return TicketFrontedRepository.findAll(pageable);
//	}
//
//	/**
//	 * 新增清單列表
//	 * 
//	 * @param Ticket
//	 * @return
//	 */
//	public TicketFronted save(TicketFronted TicketFronted) {
//		return TicketFrontedRepository.save(TicketFronted);
//	}
//
//	/**
//	 * 獲取一條信息
//	 * 
//	 * @param id
//	 * @return
//	 */
//
//	public Optional<TicketFronted> findById(long id) {
//		return TicketFrontedRepository.findById(id);
//	}
//
//	/**
//	 * 删除一條信息
//	 * @param id
//	 */
//	public void deleteById(long id) {
//		TicketFrontedRepository.deleteById(id);
//	}
//
//
//
//	public TicketFronted getBookById(long id) {
//		return TicketFrontedRepository.findById(id).orElse(null);
//	}
//	
//}
