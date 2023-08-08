package Overriding;


	public class Noise extends Drum {
		@Override
		public void drumBand() {
			System.out.println("over ride in Noise ");
			System.out.println("Invoking no argument method in Noise");
		}
		}


