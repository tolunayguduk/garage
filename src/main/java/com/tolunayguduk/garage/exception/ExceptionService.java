package com.tolunayguduk.garage.exception;

public class ExceptionService {
	
	public static CustomException exception(Exception ex) {
		return new CustomException(String.valueOf(ex.getId()));
	}
}
