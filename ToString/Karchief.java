package ToString;

public class Karchief {
	private String brand;
	private String color;
	private float price;
	private int length;
	private int width;
	private String shopeName;
	private String location;
	public Karchief() {
		
	}
	public Karchief(String brand, String color, float price, int length, int width, String shopeName, String location) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.length = length;
		this.width = width;
		this.shopeName = shopeName;
		this.location = location;
	}
	@Override
		public String toString() {
			return "Brand: "+this.brand+", color:"+this.color+", price:"+this.price+", length:"+this.length+", width:"+this.width+", shopename:"+this.shopeName+", location:"+this.location;
		}
	
}
