package com.tolunayguduk.garage.exception;

import org.springframework.http.HttpStatus;

public enum Exception {
	
	TICKET_NOT_FOUND(1000, "Bilet bulunamadı.", HttpStatus.NOT_FOUND),
	PLATE_NOT_FOUND(1001, "Plaka bulunamadı.", HttpStatus.NOT_FOUND),
	FULL_CAPACITY(1002, "Garage is full.", HttpStatus.CONFLICT);
	
	
	
	private Long id;
	private String explanation;
	private HttpStatus status;
	
	
	private Exception(long id, String explanation, HttpStatus status) {
		this.setId(id);
		this.setExplanation(explanation);
		this.setStatus(status);
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getExplanation() {
		return explanation;
	}


	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}


	public HttpStatus getStatus() {
		return status;
	}


	public void setStatus(HttpStatus status) {
		this.status = status;
	}


	public CustomException raise() {
		return ExceptionService.exception(this);
	}

	public static Exception getException(int id) {
        for (Exception b : Exception.values()) {
            if (b.id == id) {
                return b;
            }
        }
        return null;
    }
}
