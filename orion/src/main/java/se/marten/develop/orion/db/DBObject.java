package se.marten.develop.orion.db;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class DBObject {

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
}
