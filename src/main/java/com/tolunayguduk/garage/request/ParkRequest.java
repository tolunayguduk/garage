package com.tolunayguduk.garage.request;

import com.tolunayguduk.garage.enums.ColorEnum;
import com.tolunayguduk.garage.enums.VehicleTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParkRequest {
	
	private String plate;
	private ColorEnum color;
	private VehicleTypeEnum vehicleType;

}
