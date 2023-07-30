package com.xworkz.Main;

import com.xworkz.Doctor;
import com.xworkz.Hospital;
import com.xworkz.Nurse;

public class DoctorRunner {

	public static void main(String[] args) {
			Hospital hospital=new Hospital();
			hospital.doctor();
			hospital.operation();
			Doctor doctor=new Doctor();
			doctor.checkUp();
			doctor.qualification();
			Nurse nurse=new Nurse();
			nurse.name();
			nurse.injection();
		}

	}

