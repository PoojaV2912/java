package OverRiding2;

	public class Shop extends Mall{

@Override
public void mallInfo() {
	System.out.println("over Riding with no argument method in Shop");	
}
@Override
	public void mallInfo(int noOfCustomer) {
	System.out.println("over Riding with int argument method in Shop");	
	}
@Override
	public void mallInfo(String name, String location) {
	System.out.println("over Riding with String String argument method in Shop");	
	}
}
	