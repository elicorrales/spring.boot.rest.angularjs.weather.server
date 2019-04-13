package com.eli.spring.boot.rest.weather.api.dto;

public class HomeResponse {

    private final String response;

    public HomeResponse(String response) {

        this.response = response;
	}


	public String getResponse() {
        return response;
    }


}