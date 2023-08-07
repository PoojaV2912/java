package Overloading;

public class Plier {
	public String use;
	public int price;
	public double weight;
	public void cutter() {
		System.out.println("invoking with no argument in plier");
	}
	public void cutter(String use,int price,double weight) {
		System.out.println("invoking with String int and double argument in plier");
	}
	public void cutter(int price,double weight) {
		System.out.println("invoking with int double argument in plier");
	}
	public void cutter(double weight) {
		System.out.println("invoking with  weight argument in plier");
	}
	}


