package ToString;

public class Cave {
	private String flowStone;
	private String stalacties;
	private String stalagmites;
	private String helictites;
	private String sodaStraws;
	private String columns;
	private int length;
	private int width;
	private String stone;
	private double height;
	public Cave(String flowStone, String stalacties, String stalagmites, String helictites, String sodaStraws,
			String columns, int length, int width, String stone, double height) {
		super();
		this.flowStone = flowStone;
		this.stalacties = stalacties;
		this.stalagmites = stalagmites;
		this.helictites = helictites;
		this.sodaStraws = sodaStraws;
		this.columns = columns;
		this.length = length;
		this.width = width;
		this.stone = stone;
		this.height = height;
	}
	public Cave() {
		
	}
	@Override
		public String toString() {
			return "flowStone:"+this.flowStone+", stalacties"+this.stalacties+", stalagmites"+this.stalagmites+", helictites "+this.helictites+", sodaStraws"+this.sodaStraws+", .columns"+this.columns+", length "+this.length+", width"+this.width+", height"+this.height;
		}
	
}
