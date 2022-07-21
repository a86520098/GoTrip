package com.ispan.group3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserData, Integer>{

	UserData findByUsername(String username);
	
	@Query("SELECT u FROM UserData u WHERE u.verificationCode = ?1")
    public UserData findByVerificationCode(String code);


}
