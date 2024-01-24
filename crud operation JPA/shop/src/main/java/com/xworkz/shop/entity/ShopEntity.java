package com.xworkz.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "shop")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="findByBrand",query ="select et from ShopEntity et where brand=:brandName")
@NamedQuery(name="findByBrand1",query="select et.brand from ShopEntity et")
@NamedQuery(name="findByLightType",query="select et.lightType from ShopEntity et")
@NamedQuery(name="findBySpecialFeature",query="select et.specialFeature from ShopEntity et")
@NamedQuery(name="findByWattage",query="select et.wattage from ShopEntity et")
@NamedQuery(name="findByBulbShapeSize",query="select et.bulbShapeSize from ShopEntity et")
@NamedQuery(name="findByBulbBase",query="select et.bulbBase from ShopEntity et")
@NamedQuery(name="findByIeWattage",query="select et.ieWattage from ShopEntity et")
@NamedQuery(name="findByLightColour",query="select et.lightColour from ShopEntity et")
@NamedQuery(name="findByVoltage",query="select et.voltage from ShopEntity et")
@NamedQuery(name="findByNetQuantity",query="select et.netQuantity from ShopEntity et")

public class ShopEntity {
    @Id
    @Column(name="b_id")
    private  int id;

    @Column(name="brand")
    private String brand;

     @Column(name="light_Type")
    private  String lightType;

     @Column(name="special_feature")
    private  String specialFeature;

     @Column(name="wattage")
    private String wattage;

     @Column(name="b_shape_size")
    private  String bulbShapeSize;

     @Column(name="bulb_base")
     private  String bulbBase;

     @Column(name="IE_Wattage")
    private String ieWattage;

     @Column(name="Light_colour")
    private String lightColour;

     @Column(name="Voltage")
    private String voltage;

     @Column(name="net_quantity")
    private  int netQuantity;


}
