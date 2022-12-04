package com.tolunayguduk.garage.service;

import org.springframework.stereotype.Service;

import com.tolunayguduk.garage.request.LeaveRequest;
import com.tolunayguduk.garage.request.ParkRequest;
import com.tolunayguduk.garage.response.LeaveResponse;
import com.tolunayguduk.garage.response.ParkResponse;
import com.tolunayguduk.garage.response.StatusResponse;

@Service
public interface GarageService {

	ParkResponse park(ParkRequest request);
	LeaveResponse leave(LeaveRequest request);
	StatusResponse status();
}
