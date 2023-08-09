package OverRiding2;


	public class Police extends PoliceStation {
		@Override
		public void arrest() {
			System.out.println("invoking arrest method in Police");
		
		}

		@Override
		public void arrest(String name) {
			System.out.println("invoking arrest method of String in Police");
			arrest(name);
		}

		@Override
		public void arrest(String name, String location) {
			System.out.println("invoking arrest method of String,String in Police");
			arrest(name, location);
		}

		@Override
		public void arrest(String name, String location, int officersCount) {
			System.out.println("invoking arrest method of String,String,int in Police");
			arrest(name, location, officersCount);
		}

		@Override
		public void arrest(String name, String location, int officersCount, boolean hasJail) {
			System.out.println("invoking arrest method of String,String,int,boolean in Police");
			arrest(name, location, officersCount, hasJail);
		}

		@Override
		public void arrest(String name, String location, int officersCount, boolean hasJail, String emergencyNumber) {
			System.out.println("invoking arrest method of String,String,int,boolean,String in Police");
		}
	}


