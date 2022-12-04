package com.tolunayguduk.garage.response;

import com.tolunayguduk.garage.model.Ticket;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParkResponse {

	private Ticket ticket;
	
}
