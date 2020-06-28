package com.vpmq.yakt.admin;

import org.apache.kafka.clients.admin.Admin;
import org.apache.kafka.clients.admin.ListTopicsResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.concurrent.ExecutionException;

@Component
public class KafkaConnection {

    private Admin kafkaAdmin;

    @Autowired
    public KafkaConnection(Admin kafkaAdmin) {
        this.kafkaAdmin = kafkaAdmin;
        getTopics();
    }

    public void getTopics(){
        ListTopicsResult topicsResult = kafkaAdmin.listTopics();
        try {
            Set<String> topics = topicsResult.names().get();
            System.out.println(topics);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}
