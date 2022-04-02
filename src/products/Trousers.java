package products;

public class Trousers extends Products {
	
	private Jacket_Trouser_Sizes size;

	public Jacket_Trouser_Sizes getSize() {
		return size;
	}

	public void setSize(Jacket_Trouser_Sizes size) {
		this.size = size;
	}
	
	public Trousers(Jacket_Trouser_Sizes size, String name, String brand, double price, String color) {
		super(name, brand, price, color);
		this.size = size;
	}

	@Override
	public double applyDiscount() {
		return this.getPrice();
	}
	
	@Override
	public double applyBiggerDiscount() {
		this.setAppliedDiscount(20);
		this.setDiscountPrice(getPrice()*0.8);
		return this.getPrice()*0.8;
	}

	@Override
	public double applySizeDiscount() {
		this.setAppliedDiscount(20);
		this.setDiscountPrice(this.getPrice()*0.8);
		
		return this.getPrice()*0.8;
	}
}
