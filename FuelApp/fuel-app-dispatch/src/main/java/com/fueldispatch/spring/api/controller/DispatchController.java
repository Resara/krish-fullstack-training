package com.fueldispatch.spring.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fueldispatch.spring.api.model.Dispatch;
import com.fueldispatch.spring.api.service.DispatchService;

@RestController
@RequestMapping("api/v1/dispatch")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class DispatchController {
	
	@Autowired
	DispatchService dispatchService;

	@GetMapping
	public ResponseEntity<List<Dispatch>> getDispatchables(){
		return dispatchService.getDispatchables();
	}
}
