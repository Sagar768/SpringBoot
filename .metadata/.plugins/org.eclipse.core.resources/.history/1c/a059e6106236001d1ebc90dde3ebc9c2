package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.boot.beans.Gold;

@SpringBootApplication
public class SpringApp {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringApp.class, args);
		Gold gold = context.getBean(Gold.class);
		System.out.println(gold);
	}
}
