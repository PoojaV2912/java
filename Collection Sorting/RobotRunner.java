package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.app.dto.RobotDTO;
import com.xworkz.app.dto.TheatorDTO;

public class RobotRunner {

	public static void main(String[] args) {
		System.out.println("invokiing main in pendriveRuuner");
		RobotDTO robot = new RobotDTO("spot","sensors", true,452 );
		RobotDTO robot1 = new RobotDTO("atlas","camera",false, 458);
		RobotDTO robot2 = new RobotDTO("robonot","proximity", true,4025);
		RobotDTO robot3 = new RobotDTO("sophia","touchSensors", false,5896);
		RobotDTO robot4 = new RobotDTO("HAL","robotSensor", true, 4758);

		Collection<RobotDTO> robots=new ArrayList<RobotDTO>();
		robots.add(robot);
		robots.add(robot1);
		robots.add(robot2);
		robots.add(robot3);
		robots.add(robot4);
		robots.stream().sorted().forEach(pen->System.out.println(pen));
		}
	}



	
