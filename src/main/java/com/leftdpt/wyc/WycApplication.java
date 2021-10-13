package com.leftdpt.wyc;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCasClient
@SpringBootApplication
public class WycApplication {

    public static void main(String[] args) {
        SpringApplication.run(WycApplication.class, args);
    }

}
