package products;

public class Shirts extends Products {
	private Shirt_Sizes size;
	
	public void setSize(Shirt_Sizes size) {
		this.size = size;
	}
	
	public Shirt_Sizes getSize() {
		return this.size;
	}
	
	
	@Override
	public double applyDiscount() {
		this.setAppliedDiscount(10);
		this.setDiscountPrice(getPrice()*0.9);
		return(this.getPrice()*0.9);
	}
	
	@Override
	public double applyBiggerDiscount() {
		this.setAppliedDiscount(20);
		this.setDiscountPrice(this.getPrice()*0.8);
		return this.getPrice()*0.8;
	}
	
	public Shirts(Shirt_Sizes size, String name, String brand, double price, String color) {
		super(name, brand, price, color);
		this.size = size;
	
	}

	@Override
	public double applySizeDiscount() {
		this.setAppliedDiscount(20);
		this.setDiscountPrice(getPrice()*0.8);
		return this.getPrice()*0.8;
	}

}