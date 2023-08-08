package Overriding;

	public class Lock extends Gate {
		public Lock() {
			System.out.println("Invoking no argument constructor in Lock");
		}
		@Override
			public void rod() {
			System.out.println("over ride in Lock");
			System.out.println("Invoking no argument method in Lock");
			}
		}


