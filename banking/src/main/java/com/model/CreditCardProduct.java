package com.model;

import java.util.Date;

public class CreditCardProduct {

	private int id;
	private String Type;
	private Double APR;
	private int Credit_Limit;
	private String Reward_Eligible;
	private Date Offering_Date;
	private Date Expiration_Date;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public Double getAPR() {
		return APR;
	}


	public void setAPR(Double aPR) {
		APR = aPR;
	}

	public int getCredit_Limit() {
		return Credit_Limit;
	}


	public void setCredit_Limit(int credit_Limit) {
		Credit_Limit = credit_Limit;
	}

	
	public String getReward_Eligible() {
		return Reward_Eligible;
	}


	public void setReward_Eligible(String reward_Eligible) {
		Reward_Eligible = reward_Eligible;
	}


	public Date getOffering_Date() {
		return Offering_Date;
	}


	public void setOffering_Date(Date offering_Date) {
		Offering_Date = offering_Date;
	}


	public Date getExpiration_Date() {
		return Expiration_Date;
	}


	public void setExpiration_Date(Date expiration_Date) {
		Expiration_Date = expiration_Date;
	}


	public CreditCardProduct() {
		// TODO Auto-generated constructor stub
	}


	public CreditCardProduct(String type, Double aPR, int credit_Limit, String reward_Eligible, Date offering_Date,
			Date expiration_Date) {
		super();
		Type = type;
		APR = aPR;
		Credit_Limit = credit_Limit;
		Reward_Eligible = reward_Eligible;
		Offering_Date = offering_Date;
		Expiration_Date = expiration_Date;
	}


	@Override
	public String toString() {
		return "CreditCardProduct [id=" + id + ", Type=" + Type + ", APR=" + APR + ", Credit_Limit=" + Credit_Limit
				+ ", Reward_Eligible=" + Reward_Eligible + ", Offering_Date=" + Offering_Date + ", Expiration_Date="
				+ Expiration_Date + "]";
	}

}
