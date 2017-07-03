package com.action.kafkademo;

import java.util.Properties;
import java.util.Random;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;


/**
 * partitioner 生产者
 * Created by wuyunfeng on 2017/6/20.
 */
public class TestProducer {
    public static void main(String[] args) {
        long events = Long.parseLong(args[0]);
        Random rnd = new Random();

        Properties props = new Properties();
        props.put("bootstrap.servers", "127.0.0.1:9092,127.0.0.1:9093,127.0.0.1:9094");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        // 进行partition 控制
        props.put("partitioner.class", "com.action.kafkademo.SimplePartitioner");

        Producer<String, String> producer = new KafkaProducer<>(props);

        for (long nEvents = 0; nEvents < events; nEvents++) {
            String key = String.valueOf(rnd.nextInt(1000));
            String value = "content ..." ;
            String topic = "my-visit";
            ProducerRecord<String, String> data = new ProducerRecord<>(topic, key, value);
            producer.send(data,
                    (metadata, e) -> {
                        if (e != null) {
                            e.printStackTrace();
                        } else {
                            System.out.println(metadata.toString());
                        }
                    });
        }
        producer.close();
    }
}