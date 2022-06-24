package com.logistics.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.logistics.factory.KafkaConstants;
import com.logistics.model.KafkaMessage;

@Component
public class KafkaMessageListener{

    @KafkaListener(topics = KafkaConstants.KAFKA_TOY_DELIVERY_ITEM_TOPIC, groupId = KafkaConstants.GROUP_ID, containerFactory = "kafkaListenerContainerFactory")
    public void listen(KafkaMessage data){
        System.out.println("Received the item from "+data.getSender());
        System.out.println("=== content: "+data.getContent());
        System.out.println("=== item type: "+data.getMessageType().toString());
    }
}
