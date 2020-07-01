package com.vpmq.yakt.core.model;

import java.util.Map;

public class KafkaConnection {

    private String id;
    private String name;
    private String description;
    private Map<String, Object> properties;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    private Admin kafkaAdmin;
//
//    @Autowired
//    public KafkaConnection(Admin kafkaAdmin) {
//        this.kafkaAdmin = kafkaAdmin;
//        getTopics();
//    }
//
//    public void getTopics(){
//        ListTopicsResult topicsResult = kafkaAdmin.listTopics();
//        try {
//            Set<String> topics = topicsResult.names().get();
//            System.out.println(topics);
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
//
//    }
}
