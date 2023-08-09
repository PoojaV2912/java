package OverRiding2;

	public class Cake extends Bakery{
		@Override
		public void sweet() {
			System.out.println("over Riding with no argument method in Cake");	
		}
		@Override
			public void sweet(String name, int numberOfPiece) {
			System.out.println("over Riding with String int argument method in Cake");	
			}
		@Override
			public void sweet(String name, int numberOfPiece, String location, String type, int numberOfpeople) {
			System.out.println("over Riding with String int String String int argument method in Cake");	
		}
		@Override
			public void sweet(String name, int numberOfPiece, String location, String type) {
			System.out.println("over Riding with String int String String String argument method in Cake");	

			}
		}
}
