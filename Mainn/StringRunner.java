package Main;

public class StringRunner {

	public static void main(String[] args) {
		String string = new String("Vinod");
		String ref = string.valueOf("Jeevitha");
		System.out.println(ref);
		String ref1 = string.valueOf(5);
		System.out.println(ref1);
		String ref2 = string.valueOf(ref1);
		System.out.println(ref2);
		String ref3 = string.valueOf("pooja");
		System.out.println(ref3);
		String ref4=string.join(ref3, "sagar");
		System.out.println(ref4);
		int ref5=string.codePointAt(3);
		System.out.println(ref5);
		int ref6=string.compareTo(ref2);
		System.out.println(ref6);
		String ref7=string.concat(ref4);
		System.out.println(ref7);
		Boolean ref8=string.contentEquals("Vikas");
		System.out.println(ref8);
		String ref9=string.formatted(args);
		System.out.println(ref9);
	

	}

}
