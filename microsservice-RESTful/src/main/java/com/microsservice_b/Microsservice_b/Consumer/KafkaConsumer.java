package com.microsservice_b.Microsservice_b.Consumer;

@Service
public class KafkaConsumer {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Value("${spting.kafka.consumer.group-id}")
    private String groupId;

    @KafkaListener(topics = "${spring.kafka.topic.name}",
                    groupId = "${spting.kafka.consumer.group-id}")
    public void consume(String message) {
        System.out.println("Kafka consumer belongs to group: {} received a message {} topic {}", 
                           groupId, message, topicName);
    }
}
