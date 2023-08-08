package Overriding;


	public class GoldBangle extends Bangle {

		public GoldBangle() {
			System.out.println("Invoking no argument constructor in GoldBangle");
		}

		@Override
		public void sound() {
			System.out.println("Over ride in  gold bangle");
			System.out.println("Invoking no argument Method in GoldBangle");

		}
	}


