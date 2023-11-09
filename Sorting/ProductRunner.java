package com.xworkz.collection.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import com.xworkz.app.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {
System.out.println("Running main in ProductRunner");
ProductDTO dto1=new ProductDTO(1, "Soap", 45, "Dettol", LocalDate.of(2023, 5, 4), LocalDate.of(2024, 1, 2), 10.0f, "High quality", 5,  4.5f, 100, 200,150,50, 20,20 ,"SoapStore", 3.5f, false, "SoapBox", LocalDate.of(2023, 12, 9), false, false, "India", 30, 6, false, 2, "premium", LocalDate.of(2023, 12, 1), LocalDate.of(2023, 12, 12));
ProductDTO dto2 = new ProductDTO(2, "Shampoo", 25, "Head & Shoulders", LocalDate.of(2023, 6, 10), LocalDate.of(2024, 2, 20), 15.0f, "Anti-Dandruff", 4, 4.2f, 90, 180, 140, 60, 30, 10, "ShampooStore", 2.5f, true, "ShampooBottle", LocalDate.of(2023, 11, 15), false, false, "USA", 31, 7, true, 1, "standard", LocalDate.of(2023, 11, 3), LocalDate.of(2023, 11, 13));
ProductDTO dto3 = new ProductDTO(3, "Toothpaste", 10, "Colgate", LocalDate.of(2023, 4, 15), LocalDate.of(2024, 4, 15), 5.0f, "Cavity Protection", 6, 4.0f, 80, 150, 100, 40, 20, 10, "ToothpasteStore", 1.0f, true, "ToothpasteTube", LocalDate.of(2023, 10, 5), true, false, "Canada", 32, 8, true, 2, "premium", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 11));
ProductDTO dto4 = new ProductDTO(4, "Rice", 30, "Basmati", LocalDate.of(2023, 7, 20), LocalDate.of(2024, 7, 20), 7.5f, "Long Grain", 10, 4.8f, 120, 220, 180, 70, 40, 20, "RiceStore", 5.0f, true, "RiceBag", LocalDate.of(2023, 9, 1), true, false, "India", 33, 9, true, 1, "standard", LocalDate.of(2023, 9, 15), LocalDate.of(2023, 9, 25));
ProductDTO dto5 = new ProductDTO(5, "Laptop", 800, "Dell", LocalDate.of(2023, 3, 10), LocalDate.of(2024, 3, 10), 20.0f, "High Performance", 3, 4.9f, 150, 250, 200, 80, 50, 20, "ElectronicsStore", 4.0f, true, "LaptopBox", LocalDate.of(2023, 8, 8), true, false, "USA", 34, 10, true, 2, "premium", LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 11));
ProductDTO dto6 = new ProductDTO(6, "T-shirt", 20, "Nike", LocalDate.of(2023, 2, 5), LocalDate.of(2024, 2, 5), 5.0f, "Cotton Fabric", 8, 4.7f, 110, 210, 160, 70, 30, 10, "ApparelStore", 0.5f, true, "T-shirtPolybag", LocalDate.of(2023, 7, 15), true, false, "USA", 35, 11, true, 1, "standard", LocalDate.of(2023, 7, 1), LocalDate.of(2023, 7, 11));
ProductDTO dto7 = new ProductDTO(7, "Mobile Phone", 500, "Samsung", LocalDate.of(2023, 1, 20), LocalDate.of(2024, 1, 20), 15.0f, "4G Smartphone", 4, 4.6f, 130, 230, 180, 60, 40, 10, "ElectronicsStore", 0.4f, true, "PhoneBox", LocalDate.of(2023, 6, 8), true, false, "South Korea", 36, 12, true, 2, "premium", LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 11));
ProductDTO dto8 = new ProductDTO(8, "Coffee", 12, "Starbucks", LocalDate.of(2023, 8, 15), LocalDate.of(2024, 8, 15), 8.0f, "Arabica Blend", 7, 4.4f, 90, 190, 150, 40, 30, 10, "CoffeeStore", 0.25f, true, "CoffeePack", LocalDate.of(2023, 5, 10), true, false, "USA", 37, 13, true, 1, "standard", LocalDate.of(2023, 5, 20), LocalDate.of(2023, 5, 30));
ProductDTO dto9 = new ProductDTO(9, "Toothpaste", 600, "Sony", LocalDate.of(2023, 9, 25), LocalDate.of(2024, 9, 25), 25.0f, "4K Smart TV", 2, 4.8f, 120, 220, 180, 70, 40, 20, "ElectronicsStore", 15.0f, true, "TVBox", LocalDate.of(2023, 4, 12), true, false, "Japan", 38, 14, true, 2, "premium", LocalDate.of(2023, 4, 1), LocalDate.of(2023, 4, 11));
ProductDTO dto10 = new ProductDTO(10, "Juice", 8, "Tropicana", LocalDate.of(2023, 10, 12), LocalDate.of(2024, 10, 12), 2.0f, "100% Orange Juice", 9, 4.5f, 100, 200, 150, 50, 30, 10, "BeverageStore", 1.5f, true, "JuiceBottle", LocalDate.of(2023, 3, 15), true, false, "USA", 39, 15, true, 1, "standard", LocalDate.of(2023, 3, 5), LocalDate.of(2023, 3, 15));

Collection<ProductDTO> collection=new ArrayList<ProductDTO>();
collection.add(dto1);
collection.add(dto2);
collection.add(dto3);
collection.add(dto4);
collection.add(dto5);
collection.add(dto6);
collection.add(dto7);
collection.add(dto8);
collection.add(dto9);
collection.add(dto10);

System.out.println("-----------id Assending-----------");
Comparator<ProductDTO> product=(t1,t2)->Integer.compare(t1.getId(),t2.getId());
collection.stream().sorted(product).forEach(a->System.out.println(a));

System.out.println("-----------id desc-----------");
Comparator<ProductDTO> product1=(t1,t2)->Integer.compare(t2.getId(),t1.getId());
collection.stream().sorted(product1).forEach(a->System.out.println(a));

System.out.println("-----------ratedfive Assending-----------");
Comparator<ProductDTO> product2=(t1,t2)->Integer.compare(t1. getPeopleRatedFive(),t2.getPeopleRatedFive());
collection.stream().sorted(product2).forEach(c->System.out.println(c));

System.out.println("-----------ratedfive desc-----------");
Comparator<ProductDTO> product3=(t1,t2)->Integer.compare(t2.getPeopleRatedFive(),t1.getPeopleRatedFive());
collection.stream().sorted(product3).forEach(a->System.out.println(a));

System.out.println("-----------ratedfour Assending-----------");
Comparator<ProductDTO> product4=(t1,t2)->Integer.compare(t1. getPeopleRatedFour(),t2.getPeopleRatedFour());
collection.stream().sorted(product4).forEach(c->System.out.println(c));

System.out.println("-----------ratedfour desc-----------");
Comparator<ProductDTO> product5=(t1,t2)->Integer.compare(t2.getPeopleRatedFour(),t1.getPeopleRatedFour());
collection.stream().sorted(product5).forEach(a->System.out.println(a));

System.out.println("-----------ratedthree Assending-----------");
Comparator<ProductDTO> product6=(t1,t2)->Integer.compare(t1. getPeopleRatedThree(),t2.getPeopleRatedThree());
collection.stream().sorted(product6).forEach(c->System.out.println(c));

System.out.println("-----------ratedthree desc-----------");
Comparator<ProductDTO> product7=(t1,t2)->Integer.compare(t2.getPeopleRatedThree(),t1.getPeopleRatedThree());
collection.stream().sorted(product7).forEach(a->System.out.println(a));

System.out.println("-----------ratedtwo Assending-----------");
Comparator<ProductDTO> product8=(t1,t2)->Integer.compare(t1. getPeopleRatedTwo(),t2.getPeopleRatedTwo());
collection.stream().sorted(product8).forEach(c->System.out.println(c));

System.out.println("-----------ratedtwo desc-----------");
Comparator<ProductDTO> product9=(t1,t2)->Integer.compare(t2.getPeopleRatedTwo(),t1.getPeopleRatedTwo());
collection.stream().sorted(product9).forEach(a->System.out.println(a));

System.out.println("-----------ratedone Assending-----------");
Comparator<ProductDTO> product10=(t1,t2)->Integer.compare(t1. getPeopleRatedOne(),t2.getPeopleRatedOne());
collection.stream().sorted(product10).forEach(c->System.out.println(c));

System.out.println("-----------ratedone desc-----------");
Comparator<ProductDTO> product11=(t1,t2)->Integer.compare(t2.getPeopleRatedOne(),t1.getPeopleRatedOne());
collection.stream().sorted(product11).forEach(a->System.out.println(a));

System.out.println("-----------modelNo Assending-----------");
Comparator<ProductDTO> product12=(t1,t2)->Integer.compare(t1. getModelNO(),t2.getModelNO());
collection.stream().sorted(product12).forEach(c->System.out.println(c));

System.out.println("-----------modelNo desc-----------");
Comparator<ProductDTO> product13=(t1,t2)->Integer.compare(t2.getModelNO(),t1.getModelNO());
collection.stream().sorted(product13).forEach(a->System.out.println(a));

System.out.println("-----------serialNo Assending-----------");
Comparator<ProductDTO> product14=(t1,t2)->Integer.compare(t1. getSerialNo(),t2.getSerialNo());
collection.stream().sorted(product14).forEach(c->System.out.println(c));

System.out.println("-----------serialNo desc-----------");
Comparator<ProductDTO> product15=(t1,t2)->Integer.compare(t2.getSerialNo(),t1.getSerialNo());
collection.stream().sorted(product15).forEach(a->System.out.println(a));

System.out.println("-----------warranty Assending-----------");
Comparator<ProductDTO> product16=(t1,t2)->Integer.compare(t1. getWarranty(),t2.getWarranty());
collection.stream().sorted(product16).forEach(c->System.out.println(c));

System.out.println("-----------warranty desc-----------");
Comparator<ProductDTO> product17=(t1,t2)->Integer.compare(t2.getWarranty(),t1.getWarranty());
collection.stream().sorted(product17).forEach(a->System.out.println(a));

System.out.println("-----------Quantity asc-----------");
Comparator<ProductDTO> product18=(t1,t2)->Float.compare(t1.getQuantity(),t2.getQuantity());
collection.stream().sorted(product18).forEach(b->System.out.println(b));


System.out.println("-----------Quantity desc-----------");
Comparator<ProductDTO> product19=(t1,t2)->Float.compare(t2.getQuantity(),t1.getQuantity());
collection.stream().sorted(product19).forEach(a->System.out.println(a));

System.out.println("-----------discount asc-----------");
Comparator<ProductDTO> product20=(t1,t2)->Float.compare(t1.getDiscount(),t2.getDiscount());
collection.stream().sorted(product20).forEach(b->System.out.println(b));

System.out.println("-----------discount dessc-----------");
Comparator<ProductDTO> product21=(t1,t2)->Float.compare(t2.getDiscount(),t1.getDiscount());
collection.stream().sorted(product21).forEach(b->System.out.println(b));

System.out.println("-----------rating asc-----------");
Comparator<ProductDTO> product22=(t1,t2)->Float.compare(t1.getRatings(),t2.getRatings());
collection.stream().sorted(product22).forEach(b->System.out.println(b));

System.out.println("-----------rating dessc-----------");
Comparator<ProductDTO> product23=(t1,t2)->Float.compare(t2.getRatings(),t1.getRatings());
collection.stream().sorted(product23).forEach(b->System.out.println(b));

System.out.println("-----------itemWeight asc-----------");
Comparator<ProductDTO> product24=(t1,t2)->Float.compare(t1.getItemWeight(),t2.getItemWeight());
collection.stream().sorted(product24).forEach(b->System.out.println(b));

System.out.println("-----------itemWeight dessc-----------");
Comparator<ProductDTO> product25=(t1,t2)->Float.compare(t2.getItemWeight(),t1.getItemWeight());
collection.stream().sorted(product25).forEach(b->System.out.println(b));

System.out.println("-----------price asc-----------");
Comparator<ProductDTO> product26=(t1,t2)->Double.compare(t1.getPrice(),t2.getPrice());
collection.stream().sorted(product26).forEach(b->System.out.println(b));

System.out.println("-----------price dessc-----------");
Comparator<ProductDTO> product27=(t1,t2)->Double.compare(t2.getPrice(),t1.getPrice());
collection.stream().sorted(product27).forEach(b->System.out.println(b));


System.out.println("-----------included asc-----------");
Comparator<ProductDTO> product28=(t1,t2)->Boolean.compare(t1.isIncluded(),t2.isIncluded());
collection.stream().sorted(product28).forEach(b->System.out.println(b));

System.out.println("-----------included dessc-----------");
Comparator<ProductDTO> product29=(t1,t2)->Boolean.compare(t2.isIncluded(),t1.isIncluded());
collection.stream().sorted(product29).forEach(b->System.out.println(b));

System.out.println("-----------assigned asc-----------");
Comparator<ProductDTO> product30=(t1,t2)->Boolean.compare(t1.isAssigned(),t2.isAssigned());
collection.stream().sorted(product30).forEach(b->System.out.println(b));

System.out.println("-----------assigned dessc-----------");
Comparator<ProductDTO> product31=(t1,t2)->Boolean.compare(t2.isAssigned(),t1.isAssigned());
collection.stream().sorted(product31).forEach(b->System.out.println(b));

System.out.println("-----------damaged asc-----------");
Comparator<ProductDTO> product32=(t1,t2)->Boolean.compare(t1.isDamaged(),t2.isDamaged());
collection.stream().sorted(product32).forEach(b->System.out.println(b));

System.out.println("-----------damaged dessc-----------");
Comparator<ProductDTO> product33=(t1,t2)->Boolean.compare(t2.isDamaged(),t1.isDamaged());
collection.stream().sorted(product33).forEach(b->System.out.println(b));

System.out.println("-----------returnable asc-----------");
Comparator<ProductDTO> product34=(t1,t2)->Boolean.compare(t1.isReturnable(),t2.isReturnable());
collection.stream().sorted(product34).forEach(b->System.out.println(b));

System.out.println("-----------returnable dessc-----------");
Comparator<ProductDTO> product35=(t1,t2)->Boolean.compare(t2.isReturnable(),t1.isReturnable());
collection.stream().sorted(product35).forEach(b->System.out.println(b));

System.out.println("-----------returnable asc-----------");
Comparator<ProductDTO> product36=(t1,t2)->t1.getDescription().compareTo(t2.getDescription());
collection.stream().sorted(product36).forEach(b->System.out.println(b));

System.out.println("-----------returnable desc-----------");
Comparator<ProductDTO> product37=(t1,t2)->t2.getDescription().compareTo(t1.getDescription());
collection.stream().sorted(product37).forEach(b->System.out.println(b));

System.out.println("-----------packer asc-----------");
Comparator<ProductDTO> product38=(t1,t2)->t1.getPacker().compareTo(t2.getPacker());
collection.stream().sorted(product38).forEach(b->System.out.println(b));

System.out.println("-----------packer desc-----------");
Comparator<ProductDTO> product39=(t1,t2)->t2.getPacker().compareTo(t1.getPacker());
collection.stream().sorted(product39).forEach(b->System.out.println(b));

System.out.println("-----------genericname asc-----------");
Comparator<ProductDTO> product40=(t1,t2)->t1.getGenericName().compareTo(t2.getGenericName());
collection.stream().sorted(product40).forEach(b->System.out.println(b));

System.out.println("-----------genericname desc-----------");
Comparator<ProductDTO> product41=(t1,t2)->t2.getGenericName().compareTo(t1.getGenericName());
collection.stream().sorted(product41).forEach(b->System.out.println(b));

System.out.println("-----------countryofOrgin asc-----------");
Comparator<ProductDTO> product42=(t1,t2)->t1.getCountryOfOrigin().compareTo(t2.getCountryOfOrigin());
collection.stream().sorted(product42).forEach(b->System.out.println(b));

System.out.println("-----------countryofOrgin desc-----------");
Comparator<ProductDTO> product43=(t1,t2)->t2.getCountryOfOrigin().compareTo(t1.getCountryOfOrigin());
collection.stream().sorted(product43).forEach(b->System.out.println(b));

System.out.println("-----------primaryDelivary asc-----------");
Comparator<ProductDTO> product44=(t1,t2)->t1.getPrimaryDelivery().compareTo(t2.getPrimaryDelivery());
collection.stream().sorted(product44).forEach(b->System.out.println(b));

System.out.println("-----------primaryDelivary desc-----------");
Comparator<ProductDTO> product45=(t1,t2)->t2.getPrimaryDelivery().compareTo(t1.getPrimaryDelivery());
collection.stream().sorted(product45).forEach(b->System.out.println(b));

System.out.println("-----------dateFirstAvaliable asc-----------");
Comparator<ProductDTO> product46=(t1,t2)->t1.getDateFirstAvailable().compareTo(t2.getDateFirstAvailable());
collection.stream().sorted(product46).forEach(b->System.out.println(b));

System.out.println("-----------dateFirstAvaliable desc-----------");
Comparator<ProductDTO> product47=(t1,t2)->t2.getDateFirstAvailable().compareTo(t1.getDateFirstAvailable());
collection.stream().sorted(product47).forEach(b->System.out.println(b));

System.out.println("-----------delivaryExceptedDate asc-----------");
Comparator<ProductDTO> product48=(t1,t2)->t1.getDateFirstAvailable().compareTo(t2.getDateFirstAvailable());
collection.stream().sorted(product48).forEach(b->System.out.println(b));

System.out.println("-----------delivaryExceptedDate desc-----------");
Comparator<ProductDTO> product49=(t1,t2)->t2.getDateFirstAvailable().compareTo(t1.getDateFirstAvailable());
collection.stream().sorted(product49).forEach(b->System.out.println(b));

System.out.println("-----------returnby asc-----------");
Comparator<ProductDTO> product50=(t1,t2)->t1.getReturnBy().compareTo(t2.getReturnBy());
collection.stream().sorted(product50).forEach(b->System.out.println(b));

System.out.println("-----------returnby desc-----------");
Comparator<ProductDTO> product51=(t1,t2)->t2.getReturnBy().compareTo(t1.getReturnBy());
collection.stream().sorted(product51 ).forEach(b->System.out.println(b));

System.out.println("-----------manufDate asc-----------");
Comparator<ProductDTO> product52=(t1,t2)->t1.getManufatureDate().compareTo(t2.getManufatureDate());
collection.stream().sorted(product52).forEach(b->System.out.println(b));

System.out.println("-----------manufDate desc-----------");
Comparator<ProductDTO> product53=(t1,t2)->t2.getManufatureDate().compareTo(t1.getManufatureDate());
collection.stream().sorted(product53 ).forEach(b->System.out.println(b));

System.out.println("-----------expDate asc-----------");
Comparator<ProductDTO> product54=(t1,t2)->t1.getExpiryDate().compareTo(t2.getExpiryDate());
collection.stream().sorted(product54).forEach(b->System.out.println(b));

System.out.println("-----------expfDate desc-----------");
Comparator<ProductDTO> product55=(t1,t2)->t2.getExpiryDate().compareTo(t1.getExpiryDate());
collection.stream().sorted(product55 ).forEach(b->System.out.println(b));

System.out.println("-----------name asc-----------");
Comparator<ProductDTO> product56=(t1,t2)->t1.getName().compareTo(t2.getName());
collection.stream().sorted(product56).forEach(b->System.out.println(b));

System.out.println("-----------name desc-----------");
Comparator<ProductDTO> product57=(t1,t2)->t2.getName().compareTo(t1.getName());
collection.stream().sorted(product57).forEach(b->System.out.println(b));

System.out.println("-----------company asc-----------");
Comparator<ProductDTO> product58=(t1,t2)->t1.getCompany().compareTo(t2.getCompany());
collection.stream().sorted(product58).forEach(b->System.out.println(b));

System.out.println("-----------company desc-----------");
Comparator<ProductDTO> product59=(t1,t2)->t2.getCompany().compareTo(t1.getCompany());
collection.stream().sorted(product59).forEach(b->System.out.println(b));

System.out.println("-----------peoplerated asc-----------");
Comparator<ProductDTO> product60=(t1,t2)->Float.compare(t1.getPeopleRated(),t2.getPeopleRated());
collection.stream().sorted(product60).forEach(b->System.out.println(b));

System.out.println("-----------peoplerated dessc-----------");
Comparator<ProductDTO> product61=(t1,t2)->Float.compare(t2.getPeopleRated(),t1.getPeopleRated());
collection.stream().sorted(product61).forEach(b->System.out.println(b));



System.out.println("----------3 property in assec-----------");

collection.stream().sorted(product.thenComparing(product2).thenComparing(product4)).forEach(a->System.out.println(a));
collection.stream().sorted(product6.thenComparing(product8).thenComparing(product10)).forEach(a->System.out.println(a));
collection.stream().sorted(product12.thenComparing(product14).thenComparing(product16)).forEach(a->System.out.println(a));
collection.stream().sorted(product18.thenComparing(product20).thenComparing(product22)).forEach(a->System.out.println(a));
collection.stream().sorted(product24.thenComparing(product26).thenComparing(product28)).forEach(a->System.out.println(a));
collection.stream().sorted(product30.thenComparing(product32).thenComparing(product34)).forEach(a->System.out.println(a));
collection.stream().sorted(product36.thenComparing(product38).thenComparing(product40)).forEach(a->System.out.println(a));
collection.stream().sorted(product42.thenComparing(product44).thenComparing(product46)).forEach(a->System.out.println(a));
collection.stream().sorted(product48.thenComparing(product50).thenComparing(product52)).forEach(a->System.out.println(a));
collection.stream().sorted(product54.thenComparing(product56).thenComparing(product58)).forEach(a->System.out.println(a));

System.out.println("----------2 property in desc----------");
collection.stream().sorted(product1.thenComparing(product3)).forEach(a->System.out.println(a));
collection.stream().sorted(product5.thenComparing(product7)).forEach(a->System.out.println(a));
collection.stream().sorted(product9.thenComparing(product11)).forEach(a->System.out.println(a));
collection.stream().sorted(product13.thenComparing(product15)).forEach(a->System.out.println(a));
collection.stream().sorted(product17.thenComparing(product19)).forEach(a->System.out.println(a));
collection.stream().sorted(product21.thenComparing(product23)).forEach(a->System.out.println(a));
collection.stream().sorted(product25.thenComparing(product27)).forEach(a->System.out.println(a));
collection.stream().sorted(product29.thenComparing(product31)).forEach(a->System.out.println(a));
collection.stream().sorted(product33.thenComparing(product35)).forEach(a->System.out.println(a));
collection.stream().sorted(product37.thenComparing(product39)).forEach(a->System.out.println(a));

System.out.println("------------------------------------------");
collection.stream().map(b->b.getId()).collect(Collectors.toList()).forEach(c->System.out.println(c));
System.out.println("--------------------------------------------------------------");
collection.stream().map(b->b.getName()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getPrice()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getCompany()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getManufatureDate()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getExpiryDate()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getDiscount()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getDescription()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getQuantity()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getRatings()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getPeopleRated()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getPeopleRatedFive()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getPeopleRatedFour()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getPeopleRatedThree()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getPeopleRatedTwo()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getPeopleRatedOne()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getPacker()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getItemWeight()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.isIncluded()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getGenericName()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getDateFirstAvailable()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.isAssigned()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.isDamaged()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getCountryOfOrigin()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getModelNO()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getSerialNo()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.isReturnable()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getWarranty()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getPrimaryDelivery()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getDeliveryExpectedDate()).collect(Collectors.toList()).forEach(c->System.out.println(c));
collection.stream().map(b->b.getReturnBy()).collect(Collectors.toList()).forEach(c->System.out.println(c));

	}

}
