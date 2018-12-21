package com.mysql.connection.MySqlConnection;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserInfo, Integer>{
	
}