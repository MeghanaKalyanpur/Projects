package com.Hibe.DemoHib3;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.sql.internal.SQLQueryParser;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Configuration con=new Configuration().configure().addAnnotatedClass(Student1.class);
         ServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
         SessionFactory sf=con.buildSessionFactory(reg);
         Session session=sf.openSession();
         
         Transaction tx=session.beginTransaction();
        
//         SQLQuery query=session.createSQLquery("select * from students where marks>60");//Native Query
         Query q=session.createQuery("from Student1 where rollno=7");//HQL
         Student1 s=(Student1) q.uniqueResult();
         System.out.println(s);
         
//         List<Student1> list=q.list();
//         
//         for(Student1 s1:list)
//         {
//        	 System.out.println(s1);
//         }
         
         session.getTransaction().commit();
    }
}
