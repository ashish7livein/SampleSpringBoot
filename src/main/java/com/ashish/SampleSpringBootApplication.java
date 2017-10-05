package com.ashish;

import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//Jenkins Execute Shell: BUILD_ID=dontKillMe /Users/ashishkumar.ashok/Desktop/SampleSpringBoot/api-deploy.sh dev 8800 SampleSpringBoot application.yml
@SpringBootApplication
public class SampleSpringBootApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
        ApplicationContext ctx = SpringApplication.run(SampleSpringBootApplication.class, args);

        System.out.println("Inspect the beans provided by Spring Boot:");
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println("BEAN: " + beanName);
        }

    }
}
