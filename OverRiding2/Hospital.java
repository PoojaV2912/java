package OverRiding2;

public class Hospital {
	public void injection() {
		System.out.println("Invoking with no argument method in Hospital ");
	}
	public void injection(String name) {
		System.out.println("Invoking with String argument method in Hospital ");
	}
	public void injection(String name,String location) {
		System.out.println("Invoking with String String argument method in Hospital ");
	}
	public void injection(String name,String location,int noOfStaff) {
		System.out.println("Invoking with String String int argument method in Hospital ");
	}
	public void injection(int noOfStaff) {
		System.out.println("Invoking with  int argument method in Hospital ");
	}
	public void injection(String location,int noOfStaff) {
		System.out.println("Invoking with String int argument method in Hospital ");
	}
	}


