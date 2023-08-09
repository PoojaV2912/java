package OverRiding2;

public class Hostel {
	public void girlHostel() {
		System.out.println("Invoking with no argument method in Hostel");
	}
	public void girlsHostel(String name) {
		System.out.println("Invoking with String String argument method in Hostel");
		}
	public void girlsHostel(String name,String location) {
		System.out.println("Invoking with String String argument method in Hostel");
	}
	public void girlsHostel(String name,String location,int noOfGirls) {
		System.out.println("Invoking with String String  int argument method in Hostel");
	}
	public void girlsHostel(int noOfGirls) {
		System.out.println("Invoking with int argument method in Hostel");
	}
	public void girlsHostel(String location,int noOfGirls) {
		System.out.println("Invoking with String int argument method in Hostel");
	}
}
