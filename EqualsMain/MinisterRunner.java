package EqualsMain;

import com.xworkz.Minister;

public class MinisterRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in minister Runner");
		Minister minister=new Minister("Siddaramaiah");
		Minister minister2=new Minister("Siddaramaiah");
	 boolean ref=minister.equals(minister2);
	 System.out.println("Minister name is same: "+ref);
	

	}

}
