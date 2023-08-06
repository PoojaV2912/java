package Casting.Chaining;

public class CoffeeRunner {

	public static void main(String[] args) {

				Coffee coffee=new Coffee("NesCafe",100,"RTU",500);
				System.out.println(coffee.brand);
				System.out.println(coffee.price);
				System.out.println(coffee.quantity);
				System.out.println(coffee.storeName);
				System.out.println("--------------------------------------");
				Coffee coldCoffee=new ClodCoffee();
				System.out.println(coldCoffee.brand);
				System.out.println(coldCoffee.price);
				System.out.println(coldCoffee.quantity);
				System.out.println(coldCoffee.storeName);

			}

		}
		

