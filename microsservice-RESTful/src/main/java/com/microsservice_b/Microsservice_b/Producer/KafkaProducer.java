package com.microsservice_b.Microsservice_b.Producer;

@Service
public class KafkaProducer {
    @Value("${spring.kakfka.topic.name}")
    private String topicName;

    private final kafkaTemplate<String, String> kafkaTemplate;

    public kafkaProducer(kafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        System.out.println("KafkaProducer is sending a message: {} to the topic: {}",
        message, kafkaTemplate.send(topicName, message));
    }
}