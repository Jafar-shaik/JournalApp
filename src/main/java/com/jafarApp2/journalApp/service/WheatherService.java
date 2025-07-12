package com.jafarApp2.journalApp.service;

import com.jafarApp2.journalApp.api.response.WheatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WheatherService {
    @Value("${wheather.api.key}")
    private String apiKey;
    private static final String API = "http://api.weatherstack.com/current?access_key=API_KEY&query=CITY";

    @Autowired
    private RestTemplate restTemplate;

    public WheatherResponse getWhether(String city){
        String finalApi = API.replace("CITY", city).replace("API_KEY", apiKey);
        ResponseEntity<WheatherResponse> response = restTemplate.exchange(finalApi, HttpMethod.POST, null, WheatherResponse.class);
        WheatherResponse body = response.getBody();
        return body;
    }
}
