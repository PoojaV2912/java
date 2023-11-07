package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.app.dto.TheatorDTO;
import com.xworkz.app.dto.Tower;

public class TowerRunner {

	public static void main(String[] args) {
		System.out.println("invokiing main in pendriveRuuner");
		Tower tower = new Tower( 4.5f,"verticle", "hassan", "aircarft");
		Tower tower1 = new Tower( 5.0f,"concret", "mysore", "navigation");
		Tower tower2 = new Tower(4.4f,"Horizontal", "Banglore", "decoration");
		Tower tower3 = new Tower(3.5f,"Steel" ,"Manglore", "illumination");
		Tower tower4 = new Tower(4.6f,"Stone", "Manday", "elevators");

		Collection<Tower> towers=new ArrayList<Tower>();
		towers.add(tower);
		towers.add(tower1);
		towers.add(tower2);
		towers.add(tower3);
		towers.add(tower4);
		towers.stream().sorted().forEach(pen->System.out.println(pen));
		}
	}



	
