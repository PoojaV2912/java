package Overloading;

public class Gadget {
	public String sensing;
	public float price;
	public void houseHold() {
		System.out.println("invoking with no argument in Gadget");
		houseHold("Sensing",50f);
	}
	public void houseHold(String sensing) {
		houseHold(sensing);
		System.out.println("invoking with String argument in Gadget");
	}
	public void houseHold(String sensing,float price) {
		System.out.println("invoking with String float argument in Gadget");
		
	}
}