package com.fueldispatch.spring.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fueldispatch.spring.api.model.Dispatch;
import com.fueldispatch.spring.api.repository.DispatchRepo;

@Service
public class DispatchServiceImpl implements DispatchService {
	
	@Autowired
	DispatchRepo dispatchRepo;

	@Override
	public Dispatch dispatchDelivery(int orderRefId, String date) {
		Dispatch dispatch = new Dispatch();
		dispatch.setOrderRefId(orderRefId);
		dispatch.setDate(date);
		
		return saveDispatch(dispatch);
	}
	
	public Dispatch saveDispatch(Dispatch dispatch) {
		return dispatchRepo.save(dispatch);
	}

	@Override
	public ResponseEntity<List<Dispatch>> getDispatchables() {
		return ResponseEntity.status(HttpStatus.OK).body(dispatchRepo.findAll());
	}


}
