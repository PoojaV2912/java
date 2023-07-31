package com.xworkz.Main;

import java.awt.geom.Area;

import com.xworkz.Building;
import com.xworkz.Corporator;
import com.xworkz.Floor;
import com.xworkz.HomeTown;
import com.xworkz.Lift;
import com.xworkz.Players;
import com.xworkz.Sport;

public class SportRunner {

	public static void main(String[] args) {
				System.out.println("Running main in SportRunner");
		String name="Cricket";
				
				Lift lift=new Lift(1);
				Lift lift1=new Lift(2);
				
				Lift[] lifts= {lift,lift1};
				
				Floor floor=new Floor("Fisrt Floor",1);
				Floor floor1=new Floor("Second Floor",2);
				Floor floor2=new Floor("Third Floor",3);
				Floor floor3=new Floor("Fourth Floor",4);
				Floor floor4=new Floor("Fifth Floor",5);
				Floor floor5=new Floor("Sixth Floor",6);
				Floor floor6=new Floor("Seventh Floor",7);
				
				Floor[] floors= {floor,floor1,floor2,floor3,floor4,floor5,floor6};

				
				Building building=new Building(floors,lifts);
				Building building1=new Building(floors,lifts);
				
				Building[] buildings= {building,building1};
				
				Corporator corporator=new Corporator("Shri",buildings);
				
				Area area=new Area();
				Area area1=new Area();
				
				Area[] areas= {area,area1};
				
				HomeTown town=new HomeTown("Bangalore",678976,areas);
				
				Players player=new Players("Virat",20,town,building);
				Players player1=new Players("M S Dhoni",30,town,building1);
				
				Players[] players= {player,player1};
				
				
				Sport sport=new Sport(name,players);
				sport.printInfo();

			}

		}


