package com.jafarApp2.journalApp.service;

import com.jafarApp2.journalApp.api.response.WheatherResponse;
import com.jafarApp2.journalApp.cache.AppCache;
import com.jafarApp2.journalApp.constants.PlaceHolders;
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
    @Autowired
    private AppCache appCache;
    @Autowired
    private RestTemplate restTemplate;

    public WheatherResponse getWhether(String city){
        String finalApi = appCache.appCache.get(AppCache.keys.WEATHER_API.toString()).replace(PlaceHolders.CITY, city).replace(PlaceHolders.API_KEY, apiKey);
        ResponseEntity<WheatherResponse> response = restTemplate.exchange(finalApi, HttpMethod.POST, null, WheatherResponse.class);
        WheatherResponse body = response.getBody();
        return body;
    }
}
