package se.marten.develop.orion.db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User implements Serializable{

	private static final long serialVersionUID = 7143420933332733888L;
	private String name;
	private String username;
	private String password;
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	public Long getId() {
	      return id;
	}
	public void setId(final Long id) {
		this.id = id;
	}
	 
	public User(String name, String userName, String passWord){
		this.name = name;
		this.username = userName;
		this.password = passWord;
	}
	
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
