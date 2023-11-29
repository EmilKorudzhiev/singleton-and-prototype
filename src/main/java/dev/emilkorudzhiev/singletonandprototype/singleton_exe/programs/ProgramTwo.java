package dev.emilkorudzhiev.singletonandprototype.singleton_exe.programs;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1/program2")
public class ProgramTwo extends ProgramAbstract {

    @PostMapping(path = "{message}")
    public void addMessage(@PathVariable("message") String message) {
        log(message);
    }

    @GetMapping(path = "get-logs")
    public HashMap<String, String> returnLogs() {
        return logger.getLogs();
    }

    @Override
    void log(String message) {
        logger.logMessage("Program Two", message);
    }
}
