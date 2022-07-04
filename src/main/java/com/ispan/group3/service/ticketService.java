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

import com.ispan.group3.repository.ticketBean;
import com.ispan.group3.repository.ticketRepository;


@Service
@Transactional
public class ticketService{

	@Autowired
	private ticketRepository ticketRepository;

	/**
	 * 查詢所有的書單列表
	 * 
	 * @return
	 */
	public List<ticketBean> findAll() {
		return ticketRepository.findAll();
	}
	
	/**
	 * 查詢分頁內的所有書單
	 */
	public Page<ticketBean> findAllByPage(Pageable pageable){
//		排列:最新數據在上
//		PageRequest pageable = PageRequest.of(0,5, Sort.Direction.DESC,"id");
		return ticketRepository.findAll(pageable);
	}

	/**
	 * 新增 讀書清單列表
	 * 
	 * @param ticketBean
	 * @return
	 */
	public ticketBean save(ticketBean ticketBean) {
		return ticketRepository.save(ticketBean);
	}

	/**
	 * 獲取一條書單信息
	 * 
	 * @param id
	 * @return
	 */

	public Optional<ticketBean> findById(long ticketNo) {
		return ticketRepository.findById(ticketNo);
	}

	/**
	 * 删除一條書單信息
	 * @param id
	 */
	public void deleteById(long ticketNo) {
		ticketRepository.deleteById(ticketNo);
	}



	public ticketBean getBookById(Long ticketNo) {
		return ticketRepository.findById(ticketNo).orElse(null);
	}

//	@Override
//	public Optional<Book> findById(Long id) {
//		return bookRepository.findById(id).orElse(null);
//	}

}
