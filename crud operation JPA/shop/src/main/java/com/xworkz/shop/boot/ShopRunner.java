package com.xworkz.shop.boot;

import com.xworkz.shop.entity.ShopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        System.out.println("ET" + et);
        et.begin();
        System.out.println("ET begin");
        System.out.println("Starting operation");
        ShopEntity shopEntity = new ShopEntity(1, "panasonic", "LED", "Eye-Friendly", "9 Watt Hours", "A15", "B22D", "9 Watt Hours", "White", "240volts", 2);
        ShopEntity shopEn1 = new ShopEntity(2, "Nichia", "Halogen", "Color-rendering", "1 Watt Hours", "757G", "B2D", "10 Watt Hours", "yellow", "6volts", 3);
        em.persist(shopEntity);
        em.persist(shopEn1);
        et.commit();
        System.out.println("Transaction is commited...");
        System.out.println("Closing the emf and em...");
        emf.close();
        em.close();
    }
}
