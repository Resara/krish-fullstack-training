package com.fueldispatch.spring.api.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.fueldispatch.spring.api.model.Dispatch;

public interface DispatchService {
	public Dispatch dispatchDelivery( int orderRefId, String date);
	public ResponseEntity<List<Dispatch>> getDispatchables(); 
}