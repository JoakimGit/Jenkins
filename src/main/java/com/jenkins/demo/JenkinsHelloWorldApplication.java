package com.jenkins.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsHelloWorldApplication.class, args);
        System.out.println("Hello World");
        System.out.println("We meet again");
    }

}
