package com.xworkz.fertilizer.repository;

import com.xworkz.fertilizer.entity.FertilizerEntity;

import javax.persistence.*;
import java.sql.SQLOutput;

public class FertilizerRepoImpl implements FertilizerRepo{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");

    @Override
    public Integer save(FertilizerEntity entity) {
        System.out.println("Starting of FertilizerEntity:"+entity);
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            System.out.println("Starting ET");
            et.begin();
            System.out.println("starting of persist");
            em.persist(entity);
            System.out.println("persist success");
            et.commit();
            return entity.getId();
        }
        catch (PersistenceException pe){
            System.out.println("PersistenceException in save method of fertilizer:"+pe.getMessage());
            et.rollback();
        }
        finally {
            System.out.println("Closing the resources");
            em.close();
        }
        return null;
    }
}
