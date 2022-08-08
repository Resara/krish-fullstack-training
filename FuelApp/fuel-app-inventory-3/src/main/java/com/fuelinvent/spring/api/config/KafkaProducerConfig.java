package com.fuelinvent.spring.api.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.fuelinvent.spring.api.model.Reserve;

@Configuration
public class KafkaProducerConfig {

	public Map<String, Object> producerConfig(){
		Map<String, Object> prod =  new HashMap<>();
		
		prod.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		prod.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		prod.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		
		return prod;
	}
	
	@Bean
	public ProducerFactory<String, Reserve> producerFactory() {
		return new DefaultKafkaProducerFactory<>(producerConfig());
	}
	
	@Bean
	public KafkaTemplate<String, Reserve> kafkaTemplate(ProducerFactory<String, Reserve> producerFactory){
		return new KafkaTemplate<>(producerFactory);
	}
}