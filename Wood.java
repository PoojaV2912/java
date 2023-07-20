class Wood{
	String properties;
	String furniture;
	int years;
	String color;
	float thickness;
	Wood()
	{
		System.out.println("Invoking the const in Wood");
	}
	Wood(String properties)
	{
	this.properties=properties;
	System.out.println("Invoking with String arguments");
	}
	Wood(String properties,String furniture)
	{
	this.properties=properties;
	this.furniture=furniture;
	System.out.println("Invoking with String and String arguments"); 
	}
	Wood(String properties,String furniture,int years)
	{
	this("properties=properties");
	this.years=years;
	System.out.println("Invoking with String String and int arguments"); 
	}
	Wood(String properties,String furniture,int years,String color)
	{
	this("properties","furniture",years);
	this.color=color;
	System.out.println("Invoking with String String int and String arguments"); 
	}
	Wood(String properties,String furniture,int years,String color,float thickness)
	{
	this("properties","furniture",years,"color");
	this.thickness=thickness;
	System.out.println("Invoking with String String int and String arguments"); 
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	