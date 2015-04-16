package com.first.sboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
    	// to run from maven: mvn spring-boot:run
    	// to create war file for remote deployment: mvn -Pdeploy package
        SpringApplication.run(Application.class, args);
    }
}