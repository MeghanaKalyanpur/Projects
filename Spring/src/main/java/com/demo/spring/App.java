package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * XML based
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        
        Car car=(Car) context.getBean("car");
        car.drive();
        
//        Vehicle obj=(Vehicle) context.getBean("bike");
//        obj.drive();
        
//        Tyre t=(Tyre) context.getBean("tyre");
//        System.out.println(t);
    }
}
