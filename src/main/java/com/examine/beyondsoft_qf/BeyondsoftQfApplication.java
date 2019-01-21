package com.examine.beyondsoft_qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.examine.beyondsoft_qf.dao")
public class BeyondsoftQfApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeyondsoftQfApplication.class, args);
	}

}

