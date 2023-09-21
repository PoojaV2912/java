package com.xworkz.task.app.dto;

public class GroceryDTO {
	private String rice;
	private String brand;
	private int price;
	private String shopName;
	private String type;
	private double weight;
	private double fat;
	private double fiber;
	private int quantity;
	private double manganese;

	public GroceryDTO() {
		System.out.println("invoking no_arg const in GroceryDTO");
	}

	public GroceryDTO(String rice, String brand, int price, String shopName, String type, double weight, double fat,
			double fiber, int quantity, double manganese) {
		super();
		this.rice = rice;
		this.brand = brand;
		this.price = price;
		this.shopName = shopName;
		this.type = type;
		this.weight = weight;
		this.fat = fat;
		this.fiber = fiber;
		this.quantity = quantity;
		this.manganese = manganese;
	}

	public String getRice() {
		return rice;
	}

	public void setRice(String rice) {
		this.rice = rice;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public double getFiber() {
		return fiber;
	}

	public void setFiber(double fiber) {
		this.fiber = fiber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getManganese() {
		return manganese;
	}

	public void setManganese(double manganese) {
		this.manganese = manganese;
	}

	@Override
	public String toString() {
		return "GroceryDTO [rice=" + rice + ", brand=" + brand + ", price=" + price + ", shopName=" + shopName
				+ ", type=" + type + ", weight=" + weight + ", fat=" + fat + ", fiber=" + fiber + ", quantity="
				+ quantity + ", manganese=" + manganese + "]";
	}

	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof GroceryDTO) {
				System.out.println("object is GroceryDTO");
			}
			GroceryDTO casted = (GroceryDTO) obj;
			if (casted.rice.equals(obj) && casted.brand.equals(obj) && casted.price == this.price
					&& casted.shopName.equals(obj) && casted.type.equals(obj) && casted.weight == this.weight
					&& casted.fat == this.fat && casted.fiber == this.fiber && casted.quantity == this.quantity
					&& casted.manganese == this.manganese) {
				System.out.println("instance is same");
			} else {
				System.err.println("instance is not same");
				return false;
			}
		}
		return super.equals(obj);
	}
}
