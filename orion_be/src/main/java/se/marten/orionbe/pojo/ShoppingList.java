package main.java.se.marten.orionbe.pojo;

public class ShoppingList {

	 private int id;
	 private int status;
	 private String owner; 
	 private String name;
	 
	 public ShoppingList(int id, int status, String owner, String name) {
		super();
		this.id = id;
		this.status = status;
		this.owner = owner;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	 public String toString() {
	  return "Shoppinglist [id=" + id + ", status=" + status
	    + ", owner=" + owner + ", name="
	    + name + "]";
	 }
	  
}
