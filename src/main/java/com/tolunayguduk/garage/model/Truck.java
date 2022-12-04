package com.tolunayguduk.garage.model;

import com.tolunayguduk.garage.enums.VehicleTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Truck implements Vehicle {

	private final int hold = 4;
	private final VehicleTypeEnum vehicleType = VehicleTypeEnum.TRUCK;
	private String plate;

	@Override
	public VehicleTypeEnum getVehicleType() {
		return this.vehicleType;
	}
	
	@Override
	public String getPlate() {
		return this.plate;
	}
	
	@Override
	public int getHold() {
		return this.hold;
	}
	
}
