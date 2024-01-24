package com.xworkz.shop.boot;

import com.xworkz.shop.entity.ShopEntity;

import javax.persistence.*;
import java.sql.SQLOutput;

public class QueryRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("findByBrand");
        query.setParameter("brandName", "Panasonic");
        Object object = query.getSingleResult();
        ShopEntity entity = (ShopEntity) object;

        Query query1 = em.createNamedQuery("findByBrand1");
        Object object1 = query1.getSingleResult();
        String brand = (String) object1;

        Query query2 = em.createNamedQuery("findByLightType");
        Object object2 = query2.getSingleResult();
        String lightType = (String) object2;

        Query query3 = em.createNamedQuery("findBySpecialFeature");
        Object object3 = query3.getSingleResult();
        String specialFeature = (String) object3;

        Query query4 = em.createNamedQuery("findByWattage");
        Object object4 = query4.getSingleResult();
        String wattage = (String) object4;

        Query query5 = em.createNamedQuery("findByBulbShapeSize");
        Object object5 = query5.getSingleResult();
        String bulbShapeSize = (String) object5;

        Query query6 = em.createNamedQuery("findByBulbBase");
        Object object6 = query6.getSingleResult();
        String bulbBase = (String) object6;

        Query query7 = em.createNamedQuery("findByIeWattage");
        Object object7 = query7.getSingleResult();
        String ieWattage = (String) object7;

        Query query8 = em.createNamedQuery("findByLightColour");
        Object object8 = query8.getSingleResult();
        String lightColour = (String) object8;

        Query query9 = em.createNamedQuery("findByVoltage");
        Object object9 = query9.getSingleResult();
        String voltage = (String) object9;

        Query query10 = em.createNamedQuery("findByNetQuantity");
        Object object10 = query10.getSingleResult();
        Integer netQuantity = (Integer) object10;

        System.out.println("Entity from DB: " + entity);
        System.out.println("Brand from DB: " + brand);
        System.out.println("LightType from DB: " + lightType);
        System.out.println("SpecialFeature from DB: " + specialFeature);
        System.out.println("Wattage from DB: " + wattage);
        System.out.println("BulbShapeSize from DB: " + bulbShapeSize);
        System.out.println("BulbBase from DB: " + bulbBase);
        System.out.println("IeWattage from DB: " + ieWattage);
        System.out.println("LightColour from DB: " + lightColour);
        System.out.println("Voltage from DB: " + voltage);
        System.out.println("NetQuantity from DB: " + netQuantity);
        em.close();
        emf.close();
    }
}










