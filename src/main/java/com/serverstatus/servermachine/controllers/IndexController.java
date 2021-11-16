package com.serverstatus.servermachine.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	private final static Logger logger = LoggerFactory.getLogger(IndexController.class);
	String status;	
	String open = "open";
	String close = "close";
	String halfOpen = "half-open";
	public IndexController() {
		
	}
	

	@GetMapping("/open")
	public ResponseEntity<String> setOpen(){
		status = open;
		logger.info("Llamada al endpoint " + status);
		return ResponseEntity.ok("status");
	}
	
	@GetMapping("/close")
	public ResponseEntity<String> setClose(){
		status = close;
		logger.info("Llamada al endpoint " + status);
		return ResponseEntity.ok("status");
	}
	
	@GetMapping("/halfOpen")
	public ResponseEntity<String> setHalfopen(){
		status = halfOpen;
		logger.info("Llamada al endpoint " + status);
		return ResponseEntity.ok("status");
	}
	
}
