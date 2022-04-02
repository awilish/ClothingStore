package products;

public abstract class Products {
	private String name;
	private String brand;
	private double price;
	private String color;
	private int appliedDiscount;
	private double discountPrice;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setPrice(double d) {
		this.price = d;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public abstract double applyDiscount();
	public abstract double applyBiggerDiscount();
	public abstract double applySizeDiscount();
	
	Products(String name, String brand, double price, String color) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.setAppliedDiscount(0);
		this.setDiscountPrice(0);
	}

	public int getAppliedDiscount() {
		return appliedDiscount;
	}

	public void setAppliedDiscount(int appliedDiscount) {
		this.appliedDiscount = appliedDiscount;
	}

	public double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
}
