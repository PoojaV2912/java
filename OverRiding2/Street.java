package OverRiding2;

public class Street {
		public void addLandMark() {
			System.out.println("invoking addLandMark method in Street");
		}

		public void addLandMark(String name) {
			System.out.println("invoking addLandMark method of String in Street");
		}

		public void addLandMark(String name, String location) {
			System.out.println("invoking addLandMark method of String,String in Street");
		}

		public void addLandMark(String name, String location, int length) {
			System.out.println("invoking addLandMark method of String,String,int in Street");
		}

		public void addLandMark(String name, String location, int length, int lanes) {
			System.out.println("invoking addLandMark method of String,String,int,int in Street");
		}

		public void addLandMark(String name, String location, int length, int lanes, boolean hastrafficLight) {
			System.out.println("invoking addLandMark method of String,String,int,int,boolean in Street");
		}

}
