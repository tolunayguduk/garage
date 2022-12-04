package com.tolunayguduk.garage.enums;

public enum VehicleTypeEnum {

	CAR("CAR"),
	JEEP("JEEP"),
	TRUCK("TRUCK"),
	BLANK("BLANK");
	
	private String vehicleType;
	
	private VehicleTypeEnum(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

}
