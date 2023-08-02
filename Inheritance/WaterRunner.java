package Inheritance;

public class WaterRunner {

	public static void main(String[] args) {
		Bottol bottol=new Bottol();
		Bottol ref=new Water();
		Water ref1=new Water();
		System.out.println(ref1.surfaceTension);
		System.out.println(ref1.material);
		ref1.plastic();
		ref1.h2o();
	}

}
