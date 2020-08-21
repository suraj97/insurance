package com.example.flight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
/*import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;*/
import org.springframework.stereotype.Repository;

import com.example.flight.model.PaymentFile;

@Repository
public interface PaymentFileRepository extends JpaRepository<PaymentFile, String> {
	
	List<PaymentFile> findByinsurancedetails(String insurancedetails);

}