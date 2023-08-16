package ToString;

public class Logo {
	private String color;
	private int logoWidth;
	private int logoHeight;
	private float logoPrice;
	private String design;
	public Logo() {
		super();
	}
	public Logo(String color, int logoWidth, int logoHeight, float logoPrice, String design) {
		super();
		this.color = color;
		this.logoWidth = logoWidth;
		this.logoHeight = logoHeight;
		this.logoPrice = logoPrice;
		this.design = design;
	}
	
		@Override
		public String toString() {
			return "Color: "+this.color+", logoWidth:"+this.logoWidth+", logoHeight:"+this.logoHeight+", logo price:"+this.logoPrice+", Design:"+this.design;
		}
	}
