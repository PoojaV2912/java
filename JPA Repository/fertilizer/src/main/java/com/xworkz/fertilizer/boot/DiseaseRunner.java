package com.xworkz.fertilizer.boot;

import com.xworkz.fertilizer.entity.DiseaseEntity;
import com.xworkz.fertilizer.repository.DiseaseRepo;
import com.xworkz.fertilizer.repository.DiseaseRepoImpl;

import java.time.LocalDate;

public class DiseaseRunner {
    public static void main(String[] args) {
        DiseaseEntity entity=new DiseaseEntity(0,"Chikungunya","fever",23, LocalDate.of(2023,4,12));
        DiseaseRepo repository=new DiseaseRepoImpl();
        repository.save(entity);
    }
}

