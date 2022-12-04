package com.tolunayguduk.garage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tolunayguduk.garage.enums.ColorEnum;
import com.tolunayguduk.garage.request.LeaveRequest;
import com.tolunayguduk.garage.request.ParkRequest;
import com.tolunayguduk.garage.response.LeaveResponse;
import com.tolunayguduk.garage.response.ParkResponse;
import com.tolunayguduk.garage.response.StatusResponse;
import com.tolunayguduk.garage.util.GarageUtil;

@Service
public class GarageServiceImpl implements GarageService {

	@Autowired
	private GarageUtil util;

	@Override
	public ParkResponse park(ParkRequest request) {
		return new ParkResponse(util.park(request.getPlate(), request.getColor(), request.getVehicleType()));
	}

	@Override
	public LeaveResponse leave(LeaveRequest request) {
		return new LeaveResponse(util.leave(request.getTicketId()));
	}

	@Override
	public StatusResponse status() {
		return new StatusResponse(util.status());
	}

}
