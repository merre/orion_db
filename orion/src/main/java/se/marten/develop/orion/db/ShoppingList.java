package se.marten.develop.orion.db;

public class ShoppingList {

	private Long id;
	private String name;
	private int status;
	private User owner;
	
	public ShoppingList(){}
	
	public Long getId() {
      return id;
	}
	private void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
}
