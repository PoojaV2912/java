package Casting.Chaining;

public class RouterRunner {

	public static void main(String[] args) {
			System.out.println("invoking main in RouterRunner");
			Router router=new Router("Wireless",96,"Oppo-96",true);
			System.out.println(router.name);
			System.out.println(router.routerModel);
			System.out.println(router.wifi);
			System.out.println(router.connected);
			
			System.out.println("-----------------------------------");
			WirelessRouter wirelessRouter1 =new WirelessRouter("Core",21,"Realme-33",false);
			System.out.println(wirelessRouter1.name);
			System.out.println(wirelessRouter1.routerModel);
			System.out.println(wirelessRouter1.wifi);
			System.out.println(wirelessRouter1.connected);
			
			
			

		}



	}


