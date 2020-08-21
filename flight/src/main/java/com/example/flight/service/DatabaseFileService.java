package com.example.flight.service;

import java.util.List;

import com.example.flight.model.DatabaseFile;

public interface DatabaseFileService {
	public List<DatabaseFile> downloadflightdetailsByairlineName(String airlineName);

	/*public List<DatabaseFile> downloadflightdetailsBydetails(String details);*/
}