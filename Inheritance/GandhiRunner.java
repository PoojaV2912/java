package Inheritance;

public class GandhiRunner {

	public static void main(String[] args) {
	RajeevGandhi rajeevGandhi=new RajeevGandhi();
	RajeevGandhi ref=new IndiraGandhi();
	IndiraGandhi ref1=new  RahulGandhi();
	IndiraGandhi ref2=new PriyankaGandhi();
	RahulGandhi ref3=new RahulGandhi();
	System.out.println(ref.age);
	ref.possition();
	System.out.println(ref1.age);
	ref1.possition();
	System.out.println(ref2.age);
	ref2.possition();
	System.out.println(ref3.age);
	ref3.possition();
	}

}
