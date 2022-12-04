package com.tolunayguduk.garage.model;

import com.tolunayguduk.garage.enums.VehicleTypeEnum;

public interface Vehicle {

	VehicleTypeEnum getVehicleType();
	String getPlate();
	int getHold();
}
