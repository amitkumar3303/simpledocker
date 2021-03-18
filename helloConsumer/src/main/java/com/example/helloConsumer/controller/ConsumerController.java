package com.example.helloConsumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {


	private static final Logger logger = LoggerFactory.getLogger(ConsumerController.class);
	
	RestTemplate restTemplate=new RestTemplate();
	
	@GetMapping("/callProducer")
	public String name() {
		
		logger.info("---------Inside ConsumerController------");
		
		String url="http://hellopr:6061/producerHere";
		
		
		HttpHeaders httpHeaders=new HttpHeaders(); 
		HttpEntity<?> httpEntity=new HttpEntity<>(httpHeaders);
		System.out.println("consumer 111");
		logger.info("Calling producer");
		ResponseEntity<String> response = restTemplate.exchange(url,HttpMethod.GET,httpEntity,String.class);
		logger.info("produecr output in consumer"+response.getBody());
		
		return response.getBody();
	
	}
}
