package com.sczlin.cycleball;

import java.io.IOException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sczlin.cycleball.service.MockService;

@SpringBootApplication
@EnableJpaRepositories
public class WebApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebApplication.class);

    @Autowired
    private DataSource dataSource;

    @Autowired
    private MockService mock;

    public static void main(String[] args) throws Exception {

        SpringApplication.run(WebApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() throws IOException {

        mock.init();
        // Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler
        // http://localhost:8081/");
        LOGGER.info("XXX " + "Our DataSource is = " + dataSource);

    }
}
