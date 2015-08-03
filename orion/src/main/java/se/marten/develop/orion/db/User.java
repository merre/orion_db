package se.marten.develop.orion.db;

public class User {

	private Long id;
	private String name;
	private String username;
	private String password;
	
	public User(){}
	
	public String getName() {
		return name;
	}
	public Long getId() {
	      return id;
	}
	private void setId(Long id) {
		this.id = id;
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
