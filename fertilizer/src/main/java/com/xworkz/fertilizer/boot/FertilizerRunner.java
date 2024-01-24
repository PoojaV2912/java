package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.FertilizerEntity;
import com.xworkz.fertilizer.repository.FertilizerRepo;
import com.xworkz.fertilizer.repository.FertilizerRepoImpl;

import java.time.LocalDate;

public class FertilizerRunner {
    public static void main(String[] args) {
        FertilizerEntity entity= new FertilizerEntity(1,"potassium",3,1000, LocalDate.of(2023,4,5),LocalDate.of(2024,5,7));
        FertilizerRepo fertilizerRepo=new FertilizerRepoImpl();
        fertilizerRepo.save(entity);

    }
}
