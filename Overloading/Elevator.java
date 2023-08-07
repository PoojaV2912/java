package Overloading;

public class Elevator {
	public String shift;
	public int speed;
	public float steps;
	public void elevatorInfo() {
		System.out.println("invoking with no argument in Elevator");
	}
	public void elevatorInfo(String shift,int speed,float steps) {
		System.out.println("invoking with String int and float argument in Elevator");
	}
	public void elevatorInfo(String shift,int speed) {
		elevatorInfo();
		System.out.println("invoking with String int  argument in Elevator");
	}
	public void elevatorInfo(String shift) {
		elevatorInfo("up-down",30,20f);
		System.out.println("invoking with String argument in Elevator");
	}
	}


