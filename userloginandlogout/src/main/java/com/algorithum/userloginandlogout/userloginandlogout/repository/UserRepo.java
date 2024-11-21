package com.algorithum.userloginandlogout.userloginandlogout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.algorithum.userloginandlogout.userloginandlogout.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

	@Query("select userId from User where userName=:userName and userPassword=:userPassword")
	String getUserNameAndPassword(@RequestParam ("userName") String userName,@RequestParam ("userPassword") String userPassword);

	

	

	

	

	

}
