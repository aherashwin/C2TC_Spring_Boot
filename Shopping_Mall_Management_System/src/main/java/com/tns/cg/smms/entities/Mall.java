package com.tns.cg.smms.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mall")

public class Mall implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "mallName")
	private String mallName;
	@Column(name = "location")
	private String location;
	@Column(name = "categories")
	private String categories;

//Mapping
	@OneToOne(cascade = CascadeType.ALL)
	private MallAdmin mallAdmin;

//GETTER & SETTER

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MallAdmin getMallAdmin() {
		return mallAdmin;
	}

	public void setMallAdmin(MallAdmin mallAdmin) {
		this.mallAdmin = mallAdmin;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

}
