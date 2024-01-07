class Iron{
	Iron (){
		
	}
public static void wire(){
	Iron();    // error
System.out.println("invoking iron in wire");
}
public void box(){
	wire();
System.out.println("invoking iron in switch");
}
}
