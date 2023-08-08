package Overriding;


	public class Animal extends Dinosaur {
		@Override
		public void forest() {
			System.out.println("over ride in Animal");
			System.out.println("Invoking no argument method in Animal");
		}
		}


