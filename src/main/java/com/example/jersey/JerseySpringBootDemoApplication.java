package com.example.jersey;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class JerseySpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JerseySpringBootDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }

}
