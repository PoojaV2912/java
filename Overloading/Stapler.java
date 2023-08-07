package Overloading;

public class Stapler {
	public String brand;
	public int numberOfPins;
	public float price;
	public void silver() {
		this.silver("Kangaro",500,100f);
		System.out.println("invoking with no argument in Stapler");
	}
	public void silver( String brand,int numberOfPins,float price) {
		System.out.println("invoking with String int and float argument in Stapler");

	}
	public void silver( String brand) {
		System.out.println("invoking with String  argument in Stapler");
	
	}
	public void silver( String brand,float price) {
		System.out.println("invoking with String  and float argument in Stapler");
	}
	}


