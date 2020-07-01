package com.vpmq.yakt;

import com.vpmq.yakt.core.config.SystemVariables;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
public class ConnectionsManagerTests {

    @Autowired
    private SystemVariables vars;

    @Test
    public void configFolderTest() {
        String configFolder = vars.getConfigFolder();
        System.out.println("configFolder =" + configFolder);
    }

    @Test
    public void connectionFilePath() {
        String connectionFile = vars.getConnectionFilePath();
        System.out.println("connection File =" + connectionFile);
        Assertions.assertTrue(new File(connectionFile).exists());
    }
}
