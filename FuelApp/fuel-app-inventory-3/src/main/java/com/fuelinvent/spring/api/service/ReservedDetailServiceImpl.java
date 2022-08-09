package com.fuelinvent.spring.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fuelinvent.spring.api.config.kafkaTopicConfig;
import com.fuelinvent.spring.api.model.Reserve;
import com.fuelinvent.spring.api.repository.ReservedDetailRepository;


@Service
public class ReservedDetailServiceImpl implements ReservedDetailService{

	@Autowired
	ReservedDetailRepository reservedDetailRepository;
	
	@Autowired
	KafkaTemplate<String, Reserve> kafkaTemplate;
	
	@Override
	public Reserve addReserveDetails(Reserve reserve) {
		kafkaTemplate.send(kafkaTopicConfig.MESSAGE_TOPIC,reserve);
		kafkaTemplate.send(kafkaTopicConfig.MESSAGE_TOPIC,reserve);		
		return reservedDetailRepository.save(reserve);
	}

	@Override
	public Reserve getFromAvailableDetails(int referenceOrderId, String fuelType, int fuelCapacity) {
		Reserve reserve = new Reserve();
		reserve.setId(referenceOrderId);
		reserve.setFuelType(fuelType);
		reserve.setAmountReserve(fuelCapacity);
		
		return addReserveDetails(reserve);
	}

}