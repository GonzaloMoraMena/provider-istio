package com.example.provider;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Log4j2
@RestController
public class Controller {

    @GetMapping
    public Map<String, String> getStatus() {
        log.info("status: Ok 2");
        return Map.of("from", "v1");
    }

}
