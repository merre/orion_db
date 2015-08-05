package se.marten.develop.orion.db;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class User extends DBObject implements Serializable{

	private static final long serialVersionUID = 7143420933332733888L;
	private String name;
	private String username;
	private String password;
	 
	public User(){}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
