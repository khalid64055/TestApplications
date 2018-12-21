package com.mysql.connection.MySqlConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/user")
public class MainController{
	@Autowired
	
	private UserRepository userRepository;
	
	@GetMapping(path="/{userId}/{userName}")
	public @ResponseBody String AddnewUser(@PathVariable int userId, @PathVariable String userName)
	{
		UserInfo u = new UserInfo();
		u.SetId(userId);
		u.SetName(userName);
		userRepository.save(u);
		return "Saved";
	}
	@GetMapping(path="/all")
	public @ResponseBody Iterable<UserInfo> getAllUsers() {
		// This returns a JSON or XML with the users
		return userRepository.findAll();
	}
	
	@GetMapping(path="/test")
	public @ResponseBody String getTest() {
		// This returns a JSON or XML with the users
		return "Hello World";
	}
}
