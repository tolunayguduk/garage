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
public class LeaveResponse {

	public LeaveResponse(Ticket ticket) {
		this.result = ticket.getVehicle().getPlate() + " garajdan ayrıldı.";
	}

	private String result;

}
