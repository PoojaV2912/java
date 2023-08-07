package Overloading;

public class Mouse {
	public String brand;
	public String type;
	public float price;
	public void wireless() {
		System.out.println("invoking with no argument in Mouse");
	}
	public void wireless(String brand,String type,float price) {
		System.out.println("invoking with String String and float argument in Mouse");
		wireless("HP","With wire",1000);
	}
	public void wireless(String brand,float price) {
		System.out.println("invoking with String  and float argument in Mouse");
		wireless("HP","With wire",1000);
	}
	public void wireless(String brand,String type) {
		System.out.println("invoking with String String and float argument in Mouse");
		wireless();
	}
	}


