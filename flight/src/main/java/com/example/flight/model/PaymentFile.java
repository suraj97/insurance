package com.example.flight.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="payment")
public class PaymentFile implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String paymentmethod;
	private String insurancedetails;
	private Integer price;
	
	public PaymentFile() {
		super();
	}

	public PaymentFile(String paymentmethod, String insurancedetails,Integer price) {
		super();
		this.paymentmethod = paymentmethod;
		this.insurancedetails = insurancedetails;
		this.price = price;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	public String getInsurancedetails() {
		return insurancedetails;
	}

	public void setInsurancedetails(String insurancedetails) {
		this.insurancedetails = insurancedetails;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PaymentFile [ paymentmethod=" + paymentmethod + ", insurancedetails=" + insurancedetails
				+ ",price=" + Integer.toString(price) + "]";
	}
}
