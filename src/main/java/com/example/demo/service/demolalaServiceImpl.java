package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class demolalaServiceImpl implements demolalaService{

    @Override
    public Integer getTwoOf() {
        final String uri = "http://localhost:8083/calculate?first=2&second=3";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Integer> result = restTemplate.postForEntity(uri, null, Integer.class);


        Integer res = result.getBody()*3;

        return res;
    }
}
