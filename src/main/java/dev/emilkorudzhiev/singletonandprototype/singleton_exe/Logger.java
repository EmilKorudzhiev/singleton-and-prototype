package dev.emilkorudzhiev.singletonandprototype.singleton_exe;

import lombok.Data;

import java.util.HashMap;

@Data
public class Logger {
    private static Logger instance;
    private HashMap<String,String> logs;

    private Logger(HashMap<String, String> map) {
        this.logs = map;
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(new HashMap<>());
        }

        return instance;
    }

    public void logMessage(String program, String message) {
        logs.put(program, message);
    }

    public HashMap<String, String> getLogs(){
        return this.logs;
    }
}
