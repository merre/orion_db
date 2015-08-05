package se.marten.develop.orion.db;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class ShoppingList extends DBObject implements Serializable{


	private static final long serialVersionUID = -1761349408256631383L;
	private String name;
	private int status;
	private User owner;
	
	public ShoppingList(){}
	
	public ShoppingList(String name, User owner){
		this.name = name;
		this.owner = owner;
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
