package OverRiding2;

public class Bakery {

		public void sweet(String name,int numberOfPiece,String location,String type,int numberOfpeople,String ownerName) {
			System.out.println("Invoking with String int String String int String method in Bakery");
		}
		public void sweet(String name,int numberOfPiece,String location,String type,int numberOfpeople) {
			System.out.println("Invoking with String int String String int  method in Bakery");

		}
		public void sweet(String name,int numberOfPiece,String location,String type) {
			System.out.println("Invoking with String int String String  method in Bakery");

		}
		public void sweet(String name,int numberOfPiece,String location) {
			System.out.println("Invoking with String int String method in Bakery");

		}
		public void sweet(String name,int numberOfPiece) {
			System.out.println("Invoking with String int  method in Bakery");

		}
		public void sweet() {
			System.out.println("Invoking with no argument method in Bakery");

		}
		}

}
