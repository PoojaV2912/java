package Casting.Chaining;

	public class ColdCoffee extends Coffee{
		public ColdCoffee() {
			this("Bru",65,"SMT",100);
			System.out.println("invoking with no argument constructor in ColdCoffee");
		}
		public ColdCoffee(String brand,float price,String storeName,int quantity) {
			super("Bru",65,"SMT",100);
			System.out.println("invoking with no argument constructor in ColdCoffee");
		}
		}
	