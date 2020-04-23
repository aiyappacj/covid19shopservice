package com.covid19shop.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Item")
public class Item implements Serializable {
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4222203393631908723L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemid;
	private String description;
	private String itemname;
	private double price;
	private int quantity;
	private String address;
	private String emailaddress;
	private String phonenumber;
	private String freebie;
	@Lob
	private byte[] itemimage;
	
	
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getFreebie() {
		return freebie;
	}
	public void setFreebie(String freebie) {
		this.freebie = freebie;
	}
	public byte[] getItemimage() {
		return itemimage;
	}
	public void setItemimage(byte[] itemimage) {
		this.itemimage = itemimage;
	}
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Item(int itemid, String description, String itemname, double price, int quantity, String address,
			String emailaddress, String phonenumber, String freebie, byte[] itemimage) {
		super();
		this.itemid = itemid;
		this.description = description;
		this.itemname = itemname;
		this.price = price;
		this.quantity = quantity;
		this.address = address;
		this.emailaddress = emailaddress;
		this.phonenumber = phonenumber;
		this.freebie = freebie;
		this.itemimage = itemimage;
	}
	

}