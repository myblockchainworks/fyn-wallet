/**
 * 
 */
package com.aequalis.fyn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aequalis.fyn.model.User;

import java.lang.String;

/**
 * @author anand
 *
 */
public interface UserRepository extends JpaRepository<User, Long>  {
	
	User findByUsernameAndPassword(String username, String password);
	
	User findByPrivatekey(String privatekey);
	
	User findByUserid(Long userid);
	
	User findByUsername(String username);
	
	User findByBcaddress(String bcaddress);
	
}
