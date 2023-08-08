package Overriding;

	public class Banner extends Flex {
		@Override
		public void paper() {
			System.out.println("Invoking over ride in Banner");
			System.out.println("Invoking no argument method in Banner");

		}
		}


