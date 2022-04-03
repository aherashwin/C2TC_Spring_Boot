package com.tns.cg.smms.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "malladmin")

public class MallAdmin implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "password")
	private String password;
	@Column(name = "phone")
	private String phone;

//Mapping
	@OneToOne(cascade = CascadeType.ALL)
	private Mall mall;

	@OneToOne(cascade = CascadeType.ALL)
	private User user;

	@OneToOne(cascade = CascadeType.ALL)
	private ShopOwner shopowner;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Mall getMall() {
		return mall;
	}

	public void setMall(Mall mall) {
		this.mall = mall;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ShopOwner getShopowner() {
		return shopowner;
	}

	public void setShopowner(ShopOwner shopowner) {
		this.shopowner = shopowner;
	}

}
