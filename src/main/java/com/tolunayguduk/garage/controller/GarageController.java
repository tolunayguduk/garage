package com.tolunayguduk.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tolunayguduk.garage.base.BaseResponse;
import com.tolunayguduk.garage.request.LeaveRequest;
import com.tolunayguduk.garage.request.ParkRequest;
import com.tolunayguduk.garage.service.GarageService;

@RestController
@RequestMapping("/")
public class GarageController {

	@Autowired
	private GarageService service;

	@PostMapping("/park")
	public ResponseEntity<?> park(@RequestBody ParkRequest request) {
		return new ResponseEntity<>(new BaseResponse<>(service.park(request)), HttpStatus.OK);
	}

	@PostMapping("/leave")
	public ResponseEntity<?> leave(@RequestBody LeaveRequest request) {
		return new ResponseEntity<>(new BaseResponse<>(service.leave(request)), HttpStatus.OK);
	}

	@GetMapping("/status")
	public ResponseEntity<?> status() {
		return new ResponseEntity<>(new BaseResponse<>(service.status()), HttpStatus.OK);
	}
}
