package com.example.flight.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flight.model.PaymentFile;
import com.example.flight.repository.PaymentFileRepository;
import com.example.flight.service.PaymentFileService;

@Service
public class PaymentFileServiceImpl implements PaymentFileService {

	@Autowired
    private PaymentFileRepository paymentFileRepository;

	public List<PaymentFile> payinsurancepremiumByinsurancedetails(String insurancedetails) {
		return paymentFileRepository.findByinsurancedetails(insurancedetails);
	}
}
