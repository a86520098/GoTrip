package com.ispan.group3.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//JpaRepository<Book實體對象類型, Long(ID)>
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

//	分頁	查詢方法(注意import部分)
	Page<Ticket> findAll(Pageable pageable);
	
	Page<Ticket> findByTagNo( String tag_no ,Pageable pageable);
	
	Page<Ticket> findByCity( String city ,Pageable pageable);
	
	Page<Ticket> findByTagNoAndCity( String tag_no,String city ,Pageable pageable);
	
	List<Ticket> findByCompanyId(long companyId);
	
//	@Query( value = "SELECT * FROM ticket WHERE company_id = ?1", nativeQuery=true)
//	List<Ticket> findByCompany(Long ticketNo);
	
//	@Query( value = "SELECT * FROM ticket WHERE ticket_no = ?1", nativeQuery=true)
//	List<TicketFronted> findByCompany(Long Id);
	
}