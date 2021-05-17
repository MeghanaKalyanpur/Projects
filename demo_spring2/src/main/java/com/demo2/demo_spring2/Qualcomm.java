package com.demo2.demo_spring2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Qualcomm implements MobileProcessor {

	public void process() {
		System.out.println("Qualcomm's processor");
	}

}
