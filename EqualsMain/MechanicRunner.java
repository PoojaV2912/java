package EqualsMain;

import com.xworkz.Mechanic;

public class MechanicRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Mechanic Runner");
		Mechanic mechanic=new Mechanic("karthik","bangalore",50,"Washing","car wash",800f);
		Mechanic mechanic2=new Mechanic("karthik","bangalore",50,"Service","car",1000f);
		boolean ref=mechanic.equals(mechanic2);
		

	}

}
