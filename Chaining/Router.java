package Casting.Chaining;

public class Router {
		public String name;
		public int routerModel;
		public String wifi;
		public boolean connected;
		public Router(String name,int routerModel,String wifi, boolean connected)
		{
			System.out.println("invoking String,int,String,boolean in Router");
			this.name=name;
			this.routerModel=routerModel;
			this.wifi=wifi;
			this.connected=connected;
		}

	}


