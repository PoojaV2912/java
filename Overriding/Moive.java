package Overriding;


	public class Moive extends Theater {
		@Override
		public void theaterHouse() {
			System.out.println("over ride in Moive");
			System.out.println("Invoking no argument method in Moive");
		}
		}

