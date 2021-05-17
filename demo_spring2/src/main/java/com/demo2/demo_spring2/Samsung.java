package com.demo2.demo_spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("samsung")//By default nonqualifies and decapitalized classname as object
public class Samsung {
	
	@Autowired
	@Qualifier("qualcomm")
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}
	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


	public void config()
	{
		System.out.println("Octa core,12MP,Samsung");
		cpu.process();
	}

}
