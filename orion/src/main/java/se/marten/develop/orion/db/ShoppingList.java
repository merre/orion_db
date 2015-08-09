package se.marten.develop.orion.db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
	//TODO shoppinglist that user created or has shared to him/her
    @NamedQuery(name="ShoppingList.findAllForUser",
                query="SELECT s FROM ShoppingList s"),
    @NamedQuery(name="ShoppingList.findById",
                query="SELECT s FROM ShoppingList s WHERE s.id = :id"),
}) 
@Table
public class ShoppingList implements Serializable{

	private static final long serialVersionUID = -1761349408256631383L;
	private String name;
	private int status;
	private long owner;
	
	public ShoppingList() {}
	
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

	public ShoppingList(String name, long owner){
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
	public long getOwner() {
		return owner;
	}
	public void setOwner(long owner) {
		this.owner = owner;
	}
}
