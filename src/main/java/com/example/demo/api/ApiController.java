package com.example.demo.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    private static final Logger logger = LogManager.getLogger(ApiController.class);

    @PostMapping("/payload")
    public ResponseEntity<String> logPayload(@RequestBody String payload) {
        logger.info("Received payload: {}", payload);
        return ResponseEntity.ok("Payload received");
    }
}