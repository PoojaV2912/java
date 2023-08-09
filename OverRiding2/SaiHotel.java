package OverRiding2;


	public class SaiHotel extends Hotel {
		@Override
		public void restorant() {
			System.out.println("over Riding with no argument method in TajHotel");	
		}
		@Override
			public void restorant(int noOFItems) {
			System.out.println("over Riding with int argument method in TajHotel");	
			}
		@Override
			public void restorant(String location, int noOFItems) {
			System.out.println("over Riding with String int argument method in TajHotel");	
			}
		@Override
			public void restorant(String location, String name) {
			System.out.println("over Riding with String String argument method in TajHotel");	

			}
		}


