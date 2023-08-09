package OverRidingMain2;

import OverRiding2.Hostel;
import OverRiding2.PG;

public class HostelRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Hostel Runner");
		Hostel hostel=new Hostel();
		hostel.girlsHostel();
		hostel.girlsHostel(500);
		hostel.girlsHostel("SJR");
		Hostel1.hostel1=new PG();
		hostel1.getClass();
		hostel1.girlsHostel(68);
		hostel1.girlHostel("Golden");
		hostel1.girlsHostel("TRD", "Bangalore");

	}

}
