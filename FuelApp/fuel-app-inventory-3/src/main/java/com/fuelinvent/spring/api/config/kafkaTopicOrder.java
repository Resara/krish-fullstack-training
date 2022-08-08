package com.fuelinvent.spring.api.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class kafkaTopicOrder {
	
	public static final String MESSAGE_TOPIC = "orderTopic";

    @Bean
    public NewTopic myInOrderTopic(){
        return TopicBuilder.name(MESSAGE_TOPIC)
                .build();
    }

}
