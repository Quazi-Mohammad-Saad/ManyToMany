package com.mtm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String [] args)
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        //Creating object of employee class
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.setEid(1);
        e1.setName("Quazi");

        e2.setEid(2);
        e2.setName("Saad");

        Project p1 = new Project();
        Project p2 = new Project();

        p1.setPid(101);
        p1.setProjecName("Library mgmt ");

        p2.setPid(102);
        p2.setProjecName("Chatbot");

        List<Employee> l1 = new ArrayList<Employee>();
        List<Project> l2= new ArrayList<Project>();

        l1.add(e1);l1.add(e2);
        l2.add(p1);l2.add(p2);

        /////////////

        e1.setProjects(l2);
        p2.setEmployeeList(l1);

        ///saving

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        s.save(e1);
        s.save(e2);
        s.save(p1);
        s.save(p2);

        tx.commit();


        s.close();
        factory.close();
    }
}
