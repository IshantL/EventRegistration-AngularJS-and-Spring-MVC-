package com.event.dto;

import java.sql.Blob;
import java.util.Date;

public class Registration {

	private int regId;
	private String name;
	private String email;
	Blob  imgBlob;
	private String registrationType;
	private int phone;
	private int noOfTickets;
	public int getRegId() {
		return regId;
	}
	public void setRegId(int regId) {
		this.regId = regId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Blob getImgBlob() {
		return imgBlob;
	}
	public void setImgBlob(Blob imgBlob) {
		this.imgBlob = imgBlob;
	}
	public String getRegistrationType() {
		return registrationType;
	}
	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
}
