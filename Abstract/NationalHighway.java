package Abstract;

public class NationalHighway extends Highway {
	@Override
	public void dangeraboard() {
		System.out.println("over riding dangerboard in NationalHighway");
	}
	@Override
	public void rules() {
		System.out.println("over riding rules in NationalHighway");
	}
	@Override
	public void vehicles() {
		System.out.println("over riding vehicles in NationalHighway");
		
	}
	
	@Override
	public boolean highwayMan() {
		System.out.println("over riding highwayMan in NationalHighway");
		return false;
	}
	@Override
	public void tollCollection() {
		System.out.println("over riding tollCollection in NationalHighway");
		
	}
	}
	
	
	


