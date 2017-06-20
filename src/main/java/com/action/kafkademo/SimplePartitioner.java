package com.action.kafkademo;

/**
 * partitioner 控制
 * Created by wuyunfeng on 2017/6/20.
 */
import java.util.List;
import java.util.Map;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;
import org.apache.kafka.common.PartitionInfo;


public class SimplePartitioner implements Partitioner {

    @Override
    public int partition(String topic, Object key, byte[] keyBytes,
                         Object value, byte[] valueBytes, Cluster cluster) {
        int partition = 0;
        List<PartitionInfo> partitions = cluster.partitionsForTopic(topic);
        int numPartitions = partitions.size();
        int key1 =  Integer.valueOf((String) key);
        if (key1 > 0) {
            partition = key1 % numPartitions;
        }

        return partition;
    }

    @Override
    public void close() {

    }


    @Override
    public void configure(Map<String, ?> configs) {

    }
}