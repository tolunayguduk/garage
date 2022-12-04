package com.tolunayguduk.garage.enums;

public enum ColorEnum {

	BLACK("BLACK"),
	RED("RED"),
	BLUE("BLUE"),
	YELLOW("YELLOW");
	
	private String color;
	
	private ColorEnum(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
