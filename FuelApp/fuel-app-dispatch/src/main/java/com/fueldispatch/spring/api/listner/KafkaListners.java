package com.fueldispatch.spring.api.listner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fueldispatch.spring.api.model.Dispatch;
import com.fueldispatch.spring.api.service.DispatchService;

@Component
public class KafkaListners {

    @Autowired
    DispatchService dispatchService;



    @KafkaListener(topics = "schedule_dispatch_topic", groupId = "sample-group")
    public void consumeJson(@Payload List<Dispatch> data){

        String value = String.valueOf(data);
        int orderRefId = 0;
        String date = "";
      
        ObjectMapper objectMapper = new ObjectMapper();
        try {

        	 List<Dispatch> reservedOrders = objectMapper.readValue(value, new TypeReference<List<Dispatch>>(){});
            for(Dispatch order : reservedOrders) {
                orderRefId  = order.getOrderRefId();
                date = order.getDate();
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(dispatchService.dispatchDelivery(orderRefId, date));

    }
}
