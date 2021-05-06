package com.Hibe.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world! Save Object,get Object, Annotations ,Object in Object, Combining two clases as one table with@Embedded, Cacheing 1st,2nd level with ehcache
 * Secnd level cacheing with Query, Hibernate Query Language
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        AlienName an=new AlienName();
//        an.setfName("Om");
//        an.setmName("Sai");
//        an.setlName("Ram");
        
//          Alien alien=null;
        Alien alien=new Alien();
        alien.setAid(101);
        alien.setColour("Green");
//        alien.setAname(an);        
        alien.setAname("Om Sai Ram");
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
        
        ServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        
        SessionFactory sf=con.buildSessionFactory(reg);
        
//        Session session=sf.openSession();
//        
//        Transaction tx=session.beginTransaction();
//        session.save(alien);
//        System.out.println(alien);
        
//        tx.commit();
        
        Session session1=sf.openSession();
        session1.beginTransaction();
        
        Query q1=session1.createQuery("from Alien where aid=101");
        alien=(Alien)q1.uniqueResult();
        q1.setCacheable(true);
//        alien=(Alien)session1.get(Alien.class, 101);
        System.out.println(alien);
        
        session1.getTransaction().commit();
        session1.close();
        
        Session session2=sf.openSession();
        session2.beginTransaction();
        
        Query q2=session2.createQuery("from Alien where aid=101");
        alien=(Alien)q2.uniqueResult();
        q2.setCacheable(true);
//        alien=(Alien)session2.get(Alien.class, 101);
        System.out.println(alien);
        
        session2.getTransaction().commit();
        session2.close();
        
    }
}
