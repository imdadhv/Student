package com.example.demo;

import com.example.demo.dp.Singleton;
import com.example.demo.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
@RequiredArgsConstructor

public class DemoApplication implements CommandLineRunner {

//private static Singleton s;
private final PaymentService paymentService;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//s.hello();
		paymentService.doPayment();
	}
}
