package com.github.twitter.producer.kafka;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;


public class TwitterProducer {
    final Logger logger = LoggerFactory.getLogger(TwitterProducer.class);
    private String bootstrapServers = "localhost:9092";
    private Properties properties = new Properties();

    private Boolean setProducerProperties() {
            properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
            properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
            properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
            return true;
        }

    public Boolean createProducer(KafkaProducer<String,String> producer) {
             producer = new KafkaProducer<String, String>(properties);

       return true;
    }


}
