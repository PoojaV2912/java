package ToStringMain;

import ToString.Flag;

public class FlagRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in flag runner");
		Flag flag = new Flag();
		System.out.println(flag);
		Flag flag1 = new Flag("orange white green", 3, "India");
		System.out.println(flag1);
		Flag flag2 = new Flag("red white blue", 3, "USA");
		System.out.println(flag2);

	

	}

}
