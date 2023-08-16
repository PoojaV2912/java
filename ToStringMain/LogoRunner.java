package ToStringMain;

import ToString.Logo;

public class LogoRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in logo runner");
		Logo logo = new Logo();
		System.out.println(logo);
		Logo logo1 = new Logo("Cream",854,852,1236f,"Simple");
		System.out.println(logo1);
		Logo logo2 = new Logo("White",71,726,56894f,"Fanncy");
		System.out.println(logo2);
	}



	}


