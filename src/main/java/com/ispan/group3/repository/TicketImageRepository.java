package com.ispan.group3.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketImageRepository extends JpaRepository<TicketImage, Long>{
	@Query( value = "SELECT * FROM Ticket_image WHERE ticket_no = ?1", nativeQuery=true)
	List<TicketImage> findByImages(Long Id);
}
