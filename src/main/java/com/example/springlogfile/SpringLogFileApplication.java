package com.example.springlogfile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringLogFileApplication {

    Logger logger = LoggerFactory.getLogger(SpringLogFileApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringLogFileApplication.class, args);
    }

    @PostConstruct
    void testLogFile() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
    }

}
