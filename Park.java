class Park{
	String name;
	String parkType;
	String location;
	String nature;
	int  year;
	String owner;
	int noOfTress;
	int noOfBenches;
	float dimensions;


	Park(){
		System.out.println("Invoking the const in Park");
	}
	Park(String name){
		this.name=name;
		System.out.println("Invoking with String arguments");	
	}
	Park(String name,String parkType){
		this.name=name;
		this.parkType=parkType;
		System.out.println("Invoking with String and String arguments");
	}
	Park(String name,String parkType,String location){
		this("name","parkType");
		this.location=location;
		System.out.println("Invoking with String String and String arguments");
	}
	Park(String name,String parkType,String location,String nature){
		this("name","parkType","location");
		this.nature=nature;
		System.out.println("Invoking with String String String and String arguments");
	}
	Park(String name,String parkType,String location,String nature,int year){
		this("name","parkType","location","nature");
		this.year=year;
		System.out.println("Invoking with String String String String and int arguments");
	}
	Park(String name,String parkType,String location,String nature,int year,String owner){
		this("name","parkType","location","nature",year);
		this.owner=owner;
		System.out.println("Invoking with String String String String int and String arguments");
	}
	Park(String name,String parkType,String location,String nature,int year,String owner,int noOfTress){
		this("name","parkType","location","nature",year,"owner");
		this.noOfTress=noOfTress;
		System.out.println("Invoking with String String String String int String and int arguments");
	}
	Park(String name,String parkType,String location,String nature,int year,String owner,int noOfTress,int noOfBenches){
		this("name","parkType","location","nature",year,"owner",noOfTress);
		this.noOfBenches=noOfBenches;
		System.out.println("Invoking with String String String String int String and int arguments");
	}
	Park(String name,String parkType,String location,String nature,int year,String owner,int noOfTress,int noOfBenches,float dimensions){
		this("name","parkType","location","nature",year,"owner",noOfTress,noOfBenches);
		this.dimensions=dimensions;
		System.out.println("Invoking with String String String String int String int and float arguments");
	}
}