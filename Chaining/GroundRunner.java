package Casting.Chaining;

public class GroundRunner {

	public static void main(String[] args) {
		
				System.out.println("invoking mian in GroundRunner");
				Ground ground=new Ground("KSCA",45,12,"Bangalore");
				System.out.println(ground.name);
				System.out.println(ground.dimension);
				System.out.println(ground.noOfPlayer);
				System.out.println(ground.location);
				System.out.println("-------------------------------------------");
				
				CricketGround cricketGround1 =new CricketGround("Kanteerava",55,14,"Ramanagar");
				System.out.println(cricketGround1.name);
				System.out.println(cricketGround1.dimension);
				System.out.println(cricketGround1.noOfPlayer);
				System.out.println(cricketGround1.location);

			}

	

	}


