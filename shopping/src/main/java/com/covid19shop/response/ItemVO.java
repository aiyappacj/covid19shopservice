package com.covid19shop.response;

import org.springframework.web.multipart.MultipartFile;

public class ItemVO {

	private String description;
	private String itemname;
	private String price;
	private String quantity;
	private String address;
	private String emailaddress;
	private String phonenumber;
	private String freebie;
	private MultipartFile itemimage;

	public ItemVO() {

	}

	public MultipartFile getItemimage() {
		return itemimage;
	}

	public void setItemimage(MultipartFile itemimage) {
		this.itemimage = itemimage;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
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

}
