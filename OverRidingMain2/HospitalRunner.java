package OverRidingMain2;

import com.xworkz.Hospital;
import com.xworkz.Nurse;

public class HospitalRunner {
public static void main(String[] args) {
				System.out.println("Invoking main in Hospital Killer");
				Hospital hospital=new Hospital();
				hospital.injection();
				hospital.injection("Govt Hospital");
				hospital.injection(6);
				Hospital hospital1=new Nurse();
				hospital1.injection();
				hospital1.injection("Rajiv Hospital", "Hassan");
				hospital1.injection(54);
			}

		}
		
