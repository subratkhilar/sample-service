package com.as.appengine.sample_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleServiceApplication.class, args);
	}
	 @GetMapping("/")
	  public String hello() {
	    return "Hello world!";
	  }
}
