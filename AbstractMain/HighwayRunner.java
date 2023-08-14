package AbstractMain;

import Abstract.Highway;
import Abstract.NationalHighway;

public class HighwayRunner {

	public static void main(String[] args) {
		
				System.out.println("Invoking main in highway runner");
				Highway highway = new NationalHighway();
				highway.dangeraboard();
				highway.rules();
				highway.vehicles();
				highway.highwayMan();
				highway.tollCollection();
				highway.travel();
				highway.distance();
				highway.running();
				highway.walking();
				highway.type();
				highway.tollCollection();
		
			}

		}
	