package com.microsservice_db.Config;

@Configuration
public class KafkaTopicConfig {
    @Value("${spring.kafka.topic.name}") //need to be renamed
    private String topicname;            // need to be renamed 

    @Bean
    public NewTopic kafkaTopic(){        /* verify if this name should be changed */
        return TopicBuilder.name(topicname).build();
    }
}
