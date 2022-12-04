package com.tolunayguduk.garage.response;

import java.util.List;

import com.tolunayguduk.garage.model.Ticket;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatusResponse {

	private List<Ticket> tickets;
	
}
