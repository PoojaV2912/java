package Casting.Chaining;

public class GoldRunner {

	public static void main(String[] args) {

			System.out.println("invoking main in GoldRunner");
			Gold gold=new Gold("Joyalokas",50000,"Jaynagar",15);
			System.out.println(gold.shopName);
			System.out.println(gold.price);
			System.out.println(gold.shopLocation);
			System.out.println(gold.weight);
			System.out.println("--------------------------------------------");
			
			GoldPure goldPure1=new GoldPure("Vijayanagar",40000,"Mysore",25);
			System.out.println(goldPure1.shopName);
			System.out.println(goldPure1.price);
			System.out.println(goldPure1.shopLocation);
			System.out.println(goldPure1.weight);
			
			

		}
		

	}


