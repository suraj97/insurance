package com.example.flight.service;

import java.util.List;

import com.example.flight.model.PaymentFile;

public interface PaymentFileService {
	public List<PaymentFile> payinsurancepremiumByinsurancedetails(String insurancedetails);
}