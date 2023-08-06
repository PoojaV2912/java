package Casting.Chaining;

	public class GoldPure extends Gold{
		public GoldPure() {
			this("SRS",400000,"Kuvempunagar",30);
			System.out.println("invoking no-args in GoldPure");
		}
		

		public GoldPure(String shopName, double Price, String shopLocation, int weight) {
			super(shopName, Price, shopLocation, weight);
			System.out.println("invoking String,double,String,int in GoldPure");
			
		}

	}


