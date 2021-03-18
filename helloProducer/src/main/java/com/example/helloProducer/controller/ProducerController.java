package com.example.helloProducer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProducerController {

	private static final Logger logger = LoggerFactory.getLogger(ProducerController.class);

	@GetMapping("/producerHere")
	public String name() {

		logger.info("---------Inside ProducerController------");
		return "Amit here from Producer Controller";

	}
}
