package com.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mortgage")
public class MortgageProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column
	private boolean Fixed_Mortgage;
	@Column
	private int Duration;
	@Column
	private double APR;
	@Column
	private double Points;
	@Column
	private double Origination_Fee;
	@Column
	private double Min_payment;
	@Column
	private int Max_amount;
	@Column
	private Date Offering_Date;
	@Column
	private Date Expiration_Date;


	
	public int getId() {
		return id;
	}

	public boolean isFixed_Mortgage() {
		return Fixed_Mortgage;
	}

	public void setFixed_Mortgage(boolean fixed_Mortgage) {
		Fixed_Mortgage = fixed_Mortgage;
	}



	public int getDuration() {
		return Duration;
	}



	public void setDuration(int duration) {
		Duration = duration;
	}



	public double getAPR() {
		return APR;
	}



	public void setAPR(double aPR) {
		APR = aPR;
	}



	public double getPoints() {
		return Points;
	}



	public void setPoints(double points) {
		Points = points;
	}



	public double getOrigination_Fee() {
		return Origination_Fee;
	}



	public void setOrigination_Fee(double origination_Fee) {
		Origination_Fee = origination_Fee;
	}



	public double getMin_payment() {
		return Min_payment;
	}



	public void setMin_payment(double min_payment) {
		Min_payment = min_payment;
	}



	public int getMax_amount() {
		return Max_amount;
	}



	public void setMax_amount(int max_amount) {
		Max_amount = max_amount;
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



	public MortgageProduct() {
		// TODO Auto-generated constructor stub
	}

	public MortgageProduct(boolean fixed_Mortgage, int duration, double aPR, double points, double origination_Fee,
			double min_payment, int max_amount, Date offering_Date, Date expiration_Date) {
		super();
		Fixed_Mortgage = fixed_Mortgage;
		Duration = duration;
		APR = aPR;
		Points = points;
		Origination_Fee = origination_Fee;
		Min_payment = min_payment;
		Max_amount = max_amount;
		Offering_Date = offering_Date;
		Expiration_Date = expiration_Date;
	}
}
