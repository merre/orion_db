package se.marten.apps.orion.entities;

public class List {
	
	public List(){}

	private Long id;
	private Long groceryId;
	private String groceryName;
	private Long sortOrder;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getGroceryId() {
		return groceryId;
	}
	public void setGroceryId(Long groceryId) {
		this.groceryId = groceryId;
	}
	public String getGroceryName() {
		return groceryName;
	}
	public void setGroceryName(String groceryName) {
		this.groceryName = groceryName;
	}
	public Long getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}
}
