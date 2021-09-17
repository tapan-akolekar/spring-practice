package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.game.GameRunner;

@SpringBootApplication
public class SpringPracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringPracticeApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);

		runner.runGame();
	}

}
