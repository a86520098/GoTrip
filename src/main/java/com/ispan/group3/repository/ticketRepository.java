package com.ispan.group3.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


//JpaRepository<Book實體對象類型, Long(ID)>
public interface ticketRepository extends JpaRepository<ticketBean, Long> {

//	分頁	查詢方法(注意import部分)
	Page<ticketBean> findAll(Pageable pageable);
	
//	@Transactional(readOnly = true)僅可讀取
//	@Transactional(timeout = 10)執行超過十秒超時
	
//	List<Book> findByAuthor(String author);

//	List<Book> findByAuthorAndStatus(String author, int status);

//	List<Book> findByDescriptionContains(String des);

// 	  自定義查詢語句
// 	  Book.java
//    @Query("select b from Book b where length(b.name) > ?1")
//    List<Book> findByJPQL(int len);

//	Book = Book.java;	book = Data_Table_book; nativeQuery = true開啟自動查詢
//  @Query("select b from Book b where length(b.name) > ?1")
//	@Query(value = "select * from book where LENGTH(name)> ?1", nativeQuery = true)
//	List<Book> findByJPQL(int len);

//	自定義更新語句
//	@Transactional
//	@Modifying
//	@Query("update Book b set b.status = ?1 where id = ?2")
//	int updateByJPQL(int status, long id);

//	@Transactional
//	@Modifying
//	@Query("delete from Book b where b.id = ?1")
//	int deleteByJPQL(long id);

}