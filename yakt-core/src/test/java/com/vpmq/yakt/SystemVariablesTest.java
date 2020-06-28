package com.vpmq.yakt;

import com.vpmq.yakt.core.config.SystemVariables;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SystemVariablesTest {
    @Autowired
    private SystemVariables vars;

    @Test
    public void userHomeTest(){
        String userHome = vars.getUserHome();
        System.out.println("user home =" + userHome);
        Assertions.assertNotNull(userHome);
    }

}
