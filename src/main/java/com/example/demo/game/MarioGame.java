package com.example.demo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("jump");
	}
	@Override
	public void down() {
		System.out.println("duck");
	}
	@Override
	public void left() {
		System.out.println("slow");
	}
	@Override
	public void right() {
		System.out.println("fast");
	}
}
