package com.fuelinvent.spring.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fuelinvent.spring.api.model.Available;
import com.fuelinvent.spring.api.service.AvailableDetailService;

@RestController
public class AvailableController {

	@Autowired
	AvailableDetailService availableDetailService;
	
	@PostMapping("/saveAvailable")
	public ResponseEntity<Available> saveAvailableDetails(@RequestBody Available available){
		return availableDetailService.saveAvailableFuelDetail(available);
	}
}