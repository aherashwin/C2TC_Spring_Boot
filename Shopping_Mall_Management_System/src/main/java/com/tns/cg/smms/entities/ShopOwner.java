package com.tns.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shopowner")

public class ShopOwner implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "address")
	private String address;
	@Column(name = "dob")
	private LocalDate dob;

//Mapping
	@OneToOne(cascade = CascadeType.ALL)
	private User user_ID;
	@OneToOne(cascade = CascadeType.ALL)
	private MallAdmin malladmin_ID;

//GETTER & SETTER

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public User getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(User user_ID) {
		this.user_ID = user_ID;
	}

	public MallAdmin getMalladmin_ID() {
		return malladmin_ID;
	}

	public void setMalladmin_ID(MallAdmin malladmin_ID) {
		this.malladmin_ID = malladmin_ID;
	}
}
