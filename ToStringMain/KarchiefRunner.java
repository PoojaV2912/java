package ToStringMain;

import ToString.Karchief;

public class KarchiefRunner {

	public static void main(String[] args) {
		Karchief karchief = new Karchief();
		System.out.println(karchief);
		Karchief karchief1 = new Karchief("Royal","White",10,6,8,"Anagafashion","Hassan");
		System.out.println(karchief1);
		Karchief karchief2 = new Karchief("Hike","Pink",20,5,6,"colorfashion","Banglore");
		System.out.println(karchief2);

	}

}
