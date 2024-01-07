class Family{
	public static String name="son";
Family(){
}
public static void father(){
//Family();
String ref=name;
System.out.println(ref);
System.out.println("invoking no arg in family");
}
public void fatherInfo(int age){
father();
System.out.println("invoking no arg in fatherInfo"+ age);
}
}