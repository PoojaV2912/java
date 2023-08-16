package ToStringMain;

import ToString.Pendant;

public class PendantRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in pendent Runner");
		Pendant pendent = new Pendant();
		System.out.println(pendent);
		Pendant pendent1 = new Pendant("Star","gold","trending","Platinum",5,"festival","with chain","versatile","personalization",567889,10,"Hassan");
		System.out.println(pendent1);
		Pendant pendent2= new Pendant("Round","silver","old","diamond",4,"marriage","with chain","versatile","personalization",34567,20,"Bangalore");
		System.out.println(pendent2);
	

	}

}
