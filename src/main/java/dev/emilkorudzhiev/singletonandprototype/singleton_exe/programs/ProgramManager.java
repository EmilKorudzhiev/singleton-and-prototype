package dev.emilkorudzhiev.singletonandprototype.singleton_exe.programs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1/manager")
public class ProgramManager extends ProgramAbstract {

    @GetMapping(path = "get-logs")
    public HashMap<String, String> returnLogs() {
        return logger.getLogs();
    }


    @Override
    void log(String message) {
        logger.logMessage("Program Manager", message);
    }
}
