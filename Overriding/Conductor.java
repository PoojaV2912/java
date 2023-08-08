package Overriding;

	public class Conductor extends Ticket {
		@Override
		public void amount() {
			System.out.println("over ride in amount");
			System.out.println("Invoking no argument method in amount");
		}
		}


