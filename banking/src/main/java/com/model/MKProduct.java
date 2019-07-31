package com.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MoneyMarket")
public class MKProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="MinBalance")
	private int minBalance;
	@Column(name="MaxBalance")
	private int maxBalance;
	@Column(name="Compound_Day")
	private int compound_Day;
	@Column(name="Minimum_Deposit")
	private int minimum_Deposit;
	@Column(name="Offering_Date")
	private Date offering_Date;
	@Column(name="Expiration_Date")
	private Date expiration_Date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxBalance() {
		return maxBalance;
	}
	public void setMaxBalance(int maxBalance) {
		this.maxBalance = maxBalance;
	}
	public int getCompound_Day() {
		return compound_Day;
	}
	public void setCompound_Day(int compound_Day) {
		this.compound_Day = compound_Day;
	}
	public int getMinimum_Deposit() {
		return minimum_Deposit;
	}
	public void setMinimum_Deposit(int minimum_Deposit) {
		this.minimum_Deposit = minimum_Deposit;
	}
	public Date getOffering_Date() {
		return offering_Date;
	}
	public void setOffering_Date(Date offering_Date) {
		this.offering_Date = offering_Date;
	}
	public Date getExpiration_Date() {
		return expiration_Date;
	}
	public void setExpiration_Date(Date expiration_Date) {
		this.expiration_Date = expiration_Date;
	}
	@Override
	public String toString() {
		return "MKProduct [id=" + id + ", minBalance=" + minBalance + ", name=" + name + ", maxBalance=" + maxBalance
				+ ", compound_Day=" + compound_Day + ", minimum_Deposit=" + minimum_Deposit + ", offering_Date="
				+ offering_Date + ", expiration_Date=" + expiration_Date + "]";
	}
	
	
	public MKProduct() {
		super();
	}
	
	public MKProduct(int minBalance, String name, int maxBalance, int compound_Day, int minimum_Deposit,
			Date offering_Date, Date expiration_Date) {
		super();
		this.minBalance = minBalance;
		this.name = name;
		this.maxBalance = maxBalance;
		this.compound_Day = compound_Day;
		this.minimum_Deposit = minimum_Deposit;
		this.offering_Date = offering_Date;
		this.expiration_Date = expiration_Date;
	}
	

		


	
}
