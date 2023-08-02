package Inheritance;

import Inheritance.Animal.Animals;

public class AnimalRunner {

	public static void main(String[] args) {
				Animals animals=new Animals();
				Animals animal=new Dog();
				Dog dog=new puppy();
				puppy Puppy=new Milk();
				Milk milk=new Milk();
				System.out.println(animals.type);
				animal.animalsInfo();
				System.out.println(dog.type);
				dog.dogInfo();
				System.out.println(milk.type);
				milk.puppyInfo();
				System.out.println(milk.type);
				milk.milkInfo();
				
				
			}

		}


