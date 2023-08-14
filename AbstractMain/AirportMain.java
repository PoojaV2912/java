package AbstractMain;

import Abstract.AiroPlane;
import Abstract.Airport;

public class AirportMain {

	public static void main(String[] args) {
		Airport airport=new AiroPlane();
		airport.baggageHandling();
		airport.control();
		airport.emergenchServices();
		airport.foodServices();
		airport.hangars();
		airport.lounges();
		airport.restaurants();
		airport.security();
		airport.taxiWays();
	}



}
