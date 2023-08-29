package com.xworkz.farmer.app.boot;

import com.xworkz.farmer.app.Button;
import com.xworkz.farmer.app.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {
		
				System.out.println("Invoking main in ShirtRunner");
				Shirt shirt = new Shirt("Black");
				Button button = new Button();
				shirt.setButton(button);
				shirt.size();
			

	}

}
