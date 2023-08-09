package OverRiding2;

public class PG extends Hostel {
	@Override
	public void girlHostel() {
		System.out.println("over Riding with no argument method in PG");
		
	}
	@Override
	public void girlsHostel(int noOfGirls) {
		System.out.println("over Riding with int argument method in PG");
}
	@Override
	public void girlsHostel(String location, int noOfGirls) {
		System.out.println("over Riding with no argument method in PG");
	}
	@Override
	public void girlsHostel(String name, String location, int noOfGirls) {
		System.out.println("over Riding with String String int argument method in PG");
	}
}


	