package OverrideMain;

import Inheritance.Animal;
import Overriding.Dinosaur;

public class DinosaurRunner {
			public static void main(String[] args) {
				System.out.println("Invoking main in DinosaurRunner ");
				Dinosaur dinosaur=new Animal();
				dinosaur.forest();
			}

		}
	