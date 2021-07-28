package com.springboot.fundraising.repository;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@Entity
public class Donor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int DonorId;
	private String user_name;
	private String user_email;
	private String user_password;
	private String user_address;
	private String user_contact;
	private String campaign;
	
	
	public Donor() {
		super();
	}


	public Donor(int donorId, String user_name, String user_email, String user_password, String user_address,
			String user_contact, String campaign) {
		super();
		DonorId = donorId;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_address = user_address;
		this.user_contact = user_contact;
		this.campaign = campaign;
	}


	public int getDonorId() {
		return DonorId;
	}


	public void setDonorId(int donorId) {
		DonorId= donorId;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getUser_email() {
		return user_email;
	}


	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}


	public String getUser_password() {
		return user_password;
	}


	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}


	public String getUser_address() {
		return user_address;
	}


	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}


	public String getUser_contact() {
		return user_contact;
	}


	public void setUser_contact(String user_contact) {
		this.user_contact = user_contact;
	}


	public String getCampaign() {
		return campaign;
	}


	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}


	@Override
	public String toString() {
		return "Donor [DonorId=" + DonorId + ", user_name=" + user_name + ", user_email=" + user_email
				+ ", user_password=" + user_password + ", user_address=" + user_address + ", user_contact="
				+ user_contact + ", campaign=" + campaign + "]";
	}
	
	
	
	
	

}
