package com.assignment.singtel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assignment.singtel.requestDto.Bird;

@SpringBootApplication
public class Solution {

	public static void main(String[] args) {
		SpringApplication.run(Solution.class, args);
		Bird bird = new Bird();
		bird.isWalk();
		bird.isFly();
		bird.isSing();
	}

}
