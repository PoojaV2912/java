package ToString;

public class Pendant {
	private String shape;
	private String jewelry;
	private String design;
	private String material;
	private int noOfMaterials;
	private String symbolism;
	private String attachment;
	private String versatillity;
	private String personalization;
	private double price;
	private int grams;
	private String location;
	public Pendant() {

	}
	public Pendant(String shape, String jewelry, String design, String material, int noOfMaterials, String symbolism,
			String attachment, String versatillity, String personalization, double price, int grams, String location) {
		super();
		this.shape = shape;
		this.jewelry = jewelry;
		this.design = design;
		this.material = material;
		this.noOfMaterials = noOfMaterials;
		this.symbolism = symbolism;
		this.attachment = attachment;
		this.versatillity = versatillity;
		this.personalization = personalization;
		this.price = price;
		this.grams = grams;
		this.location = location;
	}
	@Override
		public String toString() {
			return "shape:"+this.shape+", jewelry"+this.jewelry+", design"+this.design+", material"+this.material+", noOfMaterials"+this.noOfMaterials+", symbolism"+this.symbolism+", attachment"+this.attachment+", versatillity"+this.versatillity+", personalization"+this.personalization+", price"+ this.price+", grams"+this.grams+", Location"+this.location;			
			}
	}


