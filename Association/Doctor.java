package com.xworkz;

public class Doctor {
	public Nurse nurse;
	public void checkUp() {
		if(this. nurse!=null) {
			this. nurse.name();
			System.out.println("invoking name in  Doctor");
		}
		else {
			System.out.println("not invokong name in Doctor ");
		}
	}
	public void qualification() {
		if(this.nurse!=null) {
			this.nurse.injection();
			System.out.println("invoking name in  Doctor");
		}
		else {
			System.out.println("not invoking name in  Doctor");
		}
	}

}


