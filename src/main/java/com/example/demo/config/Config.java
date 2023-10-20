package com.example.demo.config;

import com.example.demo.dp.Singleton;
import com.example.demo.model.Student;
import com.example.demo.service.PaymentService;
import com.example.demo.service.impl.GoldenPay;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@Slf4j
public class Config {
    @Bean
    public RestTemplate getBean() {
        return new RestTemplate();
    }

    @Bean
    public Singleton newSingleton() {
        Singleton s = new Singleton();
        System.out.println("hashcode: " + s.hashCode());
        log.error("Error log");
        return s;
    }
    @Bean
    public Student student() {


        return new Student();
    }

    @Bean
    public PaymentService paymentService() {
        return new GoldenPay();
    }

    @Bean
   public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

}

