package com.tolunayguduk.garage.model;

import com.tolunayguduk.garage.enums.ColorEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

	private long id;
	private Vehicle vehicle;
	private ColorEnum color;
	private int[] slots;
}
