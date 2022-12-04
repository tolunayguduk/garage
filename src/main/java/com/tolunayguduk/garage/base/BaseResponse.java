package com.tolunayguduk.garage.base;

import java.util.List;

import lombok.Data;

@Data
public class BaseResponse<T> {

	private int status = 200;
	private String explanation = "İşlem Başarılı";
	private Object result;
	
	public BaseResponse() {
		super();
	}
	
	public BaseResponse(T result) {
		super();
		this.result = result;
	}
	
	public BaseResponse(List<T> result) {
		super();
		this.result = result;
	}
	
	public BaseResponse(int status, String explanation) {
		super();
		this.status = status;
		this.explanation = explanation;
	}
	
	public BaseResponse(int status, String explanation, Object result) {
		super();
		this.status = status;
		this.explanation = explanation;
		this.result = result;
	}
	
}
