package ToString;

public class Flag {
	private String color;
	private int noOfColor;
	private String represents;

	public Flag() {
	}

	public Flag(String color, int noOfColor, String represents) {
		super();
		this.color = color;
		this.noOfColor = noOfColor;
		this.represents = represents;
	}

	@Override
	public String toString() {
		return "color :"+ this.color+", Number of color: "+this.noOfColor+", represents: "+this.represents;
	}


}
