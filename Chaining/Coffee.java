package Casting.Chaining;

public class Coffee {

		public String brand;
		public float price;
		public String storeName;
		public int quantity;
		public Coffee(String brand,float price,String storeName,int quantity) {
			System.out.println("invoking with argument constructor in Coffee");
			this.brand=brand;
			this.price=price;
			this.quantity=quantity;
			this.storeName=storeName;
		}
		}


