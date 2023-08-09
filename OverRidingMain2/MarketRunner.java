package OverRidingMain2;

import OverRiding2.FishMarket;
import OverRiding2.Market;

public class MarketRunner {

	public static void main(String[] args) {
		
				System.out.println("invoking main in MarketRunner");

				Market market = new Market();
				
				System.out.println("-----------------------");
				Market fishMarket = new FishMarket();
				fishMarket.sell();
			}

		}
		