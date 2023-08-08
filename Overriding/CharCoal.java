package Overriding;

public class CharCoal extends Coal {
	public CharCoal() {
		System.out.println("invoking no argument constructor in Char coal");
	}
	@Override
	public void burn() {
	System.out.println("invoking no argument method in Char coal");
		
	}

	}


