package com.logistics.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.util.SerializationUtils;

import com.google.gson.Gson;
import com.logistics.factory.KafkaConstants;
import com.momo.toys.be.model.KafkaMessage;

@Component
public class KafkaMessageListener{

    @Autowired
    private Gson gson;

    @KafkaListener(topics = KafkaConstants.KAFKA_TOY_DELIVERY_ITEM_TOPIC, groupId = KafkaConstants.GROUP_ID, containerFactory = "kafkaListenerContainerFactory")
    public void listen(String data){
        KafkaMessage kafkaMessage = gson.fromJson(data, KafkaMessage.class);
        System.out.println("Received the item from "+kafkaMessage.getSender());
    }
}
