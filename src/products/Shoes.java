package products;

public class Shoes extends Products {
	private Shoe_Sizes size;

	public Shoe_Sizes getSize() {
		return size;
	}

	public void setSize(Shoe_Sizes size) {
		this.size = size;
	}
	
	@Override
	public double applyDiscount() {
		this.setAppliedDiscount(25);
		this.setDiscountPrice(getPrice()*0.75);
		return(this.getPrice()*0.75);
	}
	
	@Override
	public double applyBiggerDiscount() {
		this.setAppliedDiscount(25);
		this.setDiscountPrice(getPrice()*0.75);
		return(this.getPrice()*0.75);
	}
	
	public Shoes(Shoe_Sizes size, String name, String brand, double price, String color) {
		super(name, brand, price, color);
		this.size = size;
	}

	@Override
	public double applySizeDiscount() {
		this.setAppliedDiscount(20);
		this.setDiscountPrice(this.getPrice()*0.8);
		return this.getPrice()*0.8;
	}
}
