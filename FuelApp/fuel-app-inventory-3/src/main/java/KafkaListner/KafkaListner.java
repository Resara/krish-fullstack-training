package KafkaListner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fuelinvent.spring.api.model.OrderModel;
import com.fuelinvent.spring.api.service.AvailableDetailService;

@Component
public class KafkaListner {
	

	@Autowired
	AvailableDetailService availableDetailService;
	
	@KafkaListener(topics = "OrderSendTestingNew", groupId = "group_id")
	public void consumeJson(@Payload List<OrderModel> orderData) {
		String orderValue =  String.valueOf(orderData);
		String fuelType = "";
		String status = "";
		int orderReferenceId = 0;
		int fuelAmmount = 0;
						
		ObjectMapper mapper = new ObjectMapper();
		
		List<OrderModel> orderModel;
		try {
			orderModel = mapper.readValue(orderValue, new TypeReference<List<OrderModel>>(){});for(OrderModel order : orderModel) {
	            fuelType = order.getFuelType();
	            fuelAmmount = order.getFuelAmmount();
	            status = order.getStatus();
	            orderReferenceId  = order.getOrderReferenceId();
			}
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		availableDetailService.getOrderCapacity(fuelType,fuelAmmount,orderReferenceId);
	}
		

}
