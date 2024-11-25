package com.microsservice_b.Microsservice_b.Config;

@Configuration
public class KafkaTopicConfig {
    @Value("${spring.kafka.topic.name}") 
    private String topicname;    

    @Bean
    public NewTopic kafkaTopic(){
        return TopicBuilder.name(topicname).build();
    }
}