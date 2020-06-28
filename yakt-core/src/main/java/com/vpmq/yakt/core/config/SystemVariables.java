package com.vpmq.yakt.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.nio.file.Paths;

@Component
public class SystemVariables {

    @Value("#{systemProperties['user.home']}")
    private String userHome;

    public String getUserHome() {
        return userHome;
    }

    public String getConfigFolder() {
        return Paths.get(userHome, ".yakt").toString();
    }

    public String getConnectionFilePath() {
        return Paths.get(getConfigFolder(), "connections.json").toString();
    }
}
