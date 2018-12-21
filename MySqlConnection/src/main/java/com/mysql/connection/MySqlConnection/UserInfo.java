package com.mysql.connection.MySqlConnection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserInfo {
	@Id
	private int id;
	private String name;
	
	public void SetId(int id)
	{
		this.id = id;
	}
	
	public void SetName(String name)
	{
		this.name = name;
	}
	
	public int GetId()
	{
		return this.id;
	}
	
	public String GetName() 
	{
		return this.name;
	}
}
