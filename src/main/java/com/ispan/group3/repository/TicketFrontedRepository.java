//package com.ispan.group3.repository;
//
//import java.util.List;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface TicketFrontedRepository extends JpaRepository<TicketFronted, Long> {
//
//	@Query( value = "SELECT * FROM Ticket_fronted WHERE ticket_no = ?1", nativeQuery=true)
//	List<TicketFronted> findByCompany(Long Id);
//}