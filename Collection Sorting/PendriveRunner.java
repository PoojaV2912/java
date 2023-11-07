package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.app.dto.HotelDTO;
import com.xworkz.app.dto.Pendrive;

public class PendriveRunner {

	public static void main(String[] args) {
System.out.println("invokiing main in pendriveRuuner");
Pendrive pendrive = new Pendrive("125GB", "HP", true, 180);
Pendrive pendrive1 = new Pendrive("64GB", "sandisk", true, 1200);
Pendrive pendrive2 = new Pendrive("128GB", "samsung", false, 120);
Pendrive pendrive3 = new Pendrive("34GB", "sony", true, 150);
Pendrive pendrive4 = new Pendrive("132GB", "kingstone", true, 250);

Collection<Pendrive> pendrives=new ArrayList<Pendrive>();
pendrives.add(pendrive);
pendrives.add(pendrive1);
pendrives.add(pendrive2);
pendrives.add(pendrive3);
pendrives.add(pendrive4);
pendrives.stream().sorted().forEach(pen->System.out.println(pen));

}
}
