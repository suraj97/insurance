package com.example.flight.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flight.model.DatabaseFile;
import com.example.flight.repository.DatabaseFileRepository;
import com.example.flight.service.DatabaseFileService;

@Service
public class DatabaseFileServiceImpl implements DatabaseFileService {

	@Autowired
    private DatabaseFileRepository databaseFileRepository;

	public List<DatabaseFile> downloadflightdetailsByairlineName(String airlineName) {
		return databaseFileRepository.findByairlineName(airlineName);
	}	
		/*public List<DatabaseFile> downloadflightdetailsBydetails(String details) {
			return databaseFileRepository.findBydetails(details);
	}*/
}
