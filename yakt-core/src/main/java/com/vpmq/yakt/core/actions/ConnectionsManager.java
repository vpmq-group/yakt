package com.vpmq.yakt.core.actions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vpmq.yakt.core.config.SystemVariables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

@Component
public class ConnectionsManager {

    private final ObjectMapper json;
    private final SystemVariables vars;

    @Autowired
    public ConnectionsManager(ObjectMapper json, SystemVariables vars) {
        this.json = json;
        this.vars = vars;
    }

    @PostConstruct
    private void init() throws IOException {
        new File(vars.getConfigFolder()).mkdirs();
        new File(vars.getConnectionFilePath()).createNewFile();
    }

}
