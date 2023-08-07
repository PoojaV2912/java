package Overloading;

public class Specs {
	public int power;
	public String lens;
public void lens() {

		System.out.println("invoking lens in Specs ");
		lens(2000);
lens("Concave");
	}
	public void lens(int power) {
		System.out.println("invoking int in lens ");
		System.out.println("Specs power: "+power);
		
	}
	public void lens(String lens) {
		System.out.println("invoking String in lens");
		System.out.println("Specs lens: "+lens);
		
		}
	public void lens(int power,String lens) {
		System.out.println("invoking with int string in Specs ");
		lens(power);
		lens(lens);

	}
	}

