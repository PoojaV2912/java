package Casting.Chaining;

	public class CricketGround extends Ground{
		public CricketGround()
		{
			this("Stadium",60,12,"Vijayanagar");
			System.out.println("invoking no-args in CricketGround");
		}
		

		public CricketGround(String name, int dimension, int noOfPlayer, String location) {
			super(name, dimension, noOfPlayer, location);
			System.out.println("invoking String,int,int,String in CricketGround");
		}

	}


