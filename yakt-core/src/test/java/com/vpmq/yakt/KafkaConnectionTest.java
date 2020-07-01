package com.vpmq.yakt;

import com.vpmq.yakt.core.model.KafkaConnection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class KafkaConnectionTest {

    private final String testId = "1";
    private final String testDescription = "2";
    private final String testName = "3";
    private final Map<String, Object> testProps = new HashMap<>();

    public KafkaConnectionTest() {
        testProps.put("abc", 1);
    }

    @Test
    public void fieldsTest() {
        KafkaConnection conn = new KafkaConnection();
        conn.setId(testId);
        Assertions.assertEquals(testId, conn.getId());
        conn.setDescription(testDescription);
        Assertions.assertEquals(testDescription, conn.getDescription());
        conn.setName(testName);
        Assertions.assertEquals(testName, conn.getName());
        conn.setProperties(testProps);
        Assertions.assertEquals(testProps, conn.getProperties());
    }

}
