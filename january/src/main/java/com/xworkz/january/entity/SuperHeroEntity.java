package com.xworkz.january.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "super_hero")
@Data

public class SuperHeroEntity {
    @Id
    @Column(name="s_id")
    private  int id;

    @Column(name="s_name")
    private  String realName;

    @Column(name="frictional_name")
    private String frictionalName;

    @Column(name="country")
    private String country;

    @Column(name="s_weakness")
    private String weakness;

    public SuperHeroEntity(int id, String realName, String frictionalName, String country, String weakness) {
        this.id=id;
        this.realName=realName;
        this.frictionalName=frictionalName;
        this.country=country;
        this.weakness=weakness;
    }
}
