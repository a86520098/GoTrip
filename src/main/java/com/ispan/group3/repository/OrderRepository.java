package com.ispan.group3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrderRepository extends JpaRepository<OrderBean, Integer> {
	
//	JPA內建方法
//	findOne.findById 同一類型內建方法
//	@Override
//	default <S extends OrderBean> Optional<S> findOne(Example<S> example);
//	default Optional<OrderBean> findById(Integer id);
//
//	@Override
//	default void deleteById(Integer id);
//
//	@Override
//	default List<OrderBean> findAll();
//
//	@Override
//	default <S extends OrderBean> S save(S entity); 
		
	
//	 JPA方法規則自訂用(memberId)查詢
	 List<OrderBean> findByMemberId(String memberId);
	
//	 自定義 CRUD    可用nativeQuery (true) 使用原生SQL語法
	 @Transactional
	 @Modifying
	 @Query("update OrderBean o set o.status = ?1 where orderNo = ?2")
	 int updateByStatus(Integer status,Integer orderId);
}
