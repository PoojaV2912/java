package Casting.Chaining;

	public class WirelessRouter extends Router{
		public WirelessRouter()
		{
			this("VPN",32,"Hotspot",true);
			System.out.println("invoking no-args in WirelessRouter");
		}

		public WirelessRouter(String name, int routerModel, String wifi, boolean connected) {
			super(name, routerModel, wifi, connected);
			System.out.println("invoking String,int,String,boolean in WirelessRouter");
			
			
		}
		

	}


