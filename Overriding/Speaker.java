package Overriding;

	public class Speaker extends Mic{
		@Override
		public void sound() {
			System.out.println("over ride in Speaker");
			System.out.println("Invoking no argument method in Speaker");
		}
		}


