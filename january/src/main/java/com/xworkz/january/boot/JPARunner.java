package com.xworkz.january.boot;

import com.xworkz.january.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPARunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        System.out.println("EM: "+em);
        EntityTransaction et=em.getTransaction();
        System.out.println("ET "+et);
        et.begin();
        System.out.println("ET Begin");
        System.out.println("Starting Operation");
        SuperHeroEntity superHeroEntity=new SuperHeroEntity(3,"Yash","Rocky Bhai","India","Moyher");
        em.persist(superHeroEntity);
        System.out.println("Operation Complete");
        et.commit();
        System.out.println("ET Commit");
        System.out.println("Closing EM,EMF");
        em.close();
        emf.close();
    }
}
