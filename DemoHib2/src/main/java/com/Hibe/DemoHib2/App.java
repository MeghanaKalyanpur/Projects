package com.Hibe.DemoHib2;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Laptop laptop=new Laptop();
        laptop.setLid(1);
        laptop.setlName("Mac");
        
        Student student=new Student();
        student.setRollno(101);
        student.setSname("Ram");
        student.setMarks(100);
        student.getLaptop().add(laptop);
//        student.setLaptop(laptop);
        laptop.getStudent().add(student);
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
        ServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf=con.buildSessionFactory(reg);
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
//        session.save(laptop);
//        session.save(student);
        
        Student stud=session.get(Student.class, 101);
        System.out.println(stud.getSname());
        
        Collection<Laptop> laps=stud.getLaptop();
        for(Laptop lap:laps)
        {
        	System.out.println(lap);
        }
        
        session.getTransaction().commit();
    }
}
