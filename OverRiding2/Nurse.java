package OverRiding2;

	public class Nurse extends Hospital{
		@Override
		public void injection() {
			System.out.println("over Riding with no argument method in Nurse");	
		}
		@Override
			public void injection(int noOfStaff) {
			System.out.println("over Riding with int argument method in Nurse");	
			}
		@Override
			public void injection(String name) {
			System.out.println("over Riding with String argument method in Nurse");	
			}
		@Override
			public void injection(String name, String location, int noOfStaff) {
			System.out.println("over Riding with String String int argument method in Nurse");	
			}
		}


