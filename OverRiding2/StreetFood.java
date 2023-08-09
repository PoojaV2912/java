package OverRiding2;


	public class StreetFood extends Street{
		@Override
		public void addLandMark() {
			System.out.println("invoking addLandMark method in StreetFood");
		
		}

		@Override
		public void addLandMark(String name) {
			System.out.println("invoking addLandMark method of String in StreetFood");
			addLandMark(name);
		}

		@Override
		public void addLandMark(String name, String location) {
			System.out.println("invoking addLandMark method of String,String in StreetFood");
			addLandMark(name, location);
		}

		@Override
		public void addLandMark(String name, String location, int length) {
			System.out.println("invoking addLandMark method of String,String,int in StreetFood");
			addLandMark(name, location, length);
		}

		@Override
		public void addLandMark(String name, String location, int length, int lanes) {
			System.out.println("invoking addLandMark method of String,String,int,int in StreetFood");
			addLandMark(name, location, length, lanes);
		}

		@Override
		public void addLandMark(String name, String location, int length, int lanes, boolean hastrafficLight) {
			System.out.println("invoking addLandMark method of String,String,int,int,boolean in StreetFood");
		}

	}


