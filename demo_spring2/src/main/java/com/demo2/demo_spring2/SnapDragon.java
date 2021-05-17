package com.demo2.demo_spring2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SnapDragon implements MobileProcessor {

	public void process() {
		System.out.println("Snapdragon processor");
	}

}
