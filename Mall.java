class Mall{
	String lifts;
	String computers;
	int floor;
	String firealram;
	String cctv;
	String generator;
	int shops;
	Mall()
	{
		System.out.println("Invoking the const in Mall");
	}
	Mall(String lifts)
	{
	this.lifts=lifts;
	System.out.println("Invoking with String arguments");
	}
	Mall(String lifts,String computers)
	{
	this.lifts=lifts;
	this.computers=computers;
	System.out.println("Invoking with String and String arguments"); 
	}
	Mall(String lifts,String computers,int floor)
	{
	this("lifts","computers");
	this.floor=floor;
	System.out.println("Invoking with String String and int arguments"); 
	}
	Mall(String lifts,String computers,int floor,String firealarm)
	{
	this("lifts",computers,floor);
	this.firealram=firealram;
	System.out.println("Invoking with String String int and String arguments"); 
	}
	Mall(String lifts,String computers,int floor,String firealarm,String cctv)
	{
	this("lifts","computers",floor,"color");
	this.cctv=cctv;
	System.out.println("Invoking with String String int String and String arguments"); 
	}
	Mall(String lifts,String computers,int floor,String firealarm,String cctv,String generator)
	{
	this("lifts","computers",floor,"firealarm","cctv");
	this.generator=generator;
	System.out.println("Invoking with String String int  String String and String arguments"); 
	
	}
	Mall(String lifts,String computers,int floor,String firealarm,String cctv,String generator,int shops)
	{
	this("lifts","computers",floor,"firealarm","cctv","generator");
	this.shops=shops;
	System.out.println("Invoking with String String int String String String String and int arguments"); 
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	