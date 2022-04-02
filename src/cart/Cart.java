package cart;

import java.util.ArrayList;
import java.util.List;

import products.Products;

public class Cart {
	
	private List<Products> products;
	double totalPrice;
	double discountedPrice;
	double biggerDiscount;
	
	public int returnSize() {
		return products.size();
	}
	
	public double getBiggerDiscount() {
		this.products.forEach((p) -> {
			this.biggerDiscount += p.applyBiggerDiscount();
		});
		return this.biggerDiscount;
	}
	
	public double getDiscountedPrice() {
		this.products.forEach((p -> {
			this.discountedPrice += p.applyDiscount();
		}));
		return discountedPrice;
	}
	
	public double getTotalPrice() {
		this.totalPrice = 0;
		this.products.forEach((p -> {
		this.totalPrice += p.getPrice();
		//System.out.println(Double.toString(p.getPrice()) + "dsasadasd");
		}));
		//System.out.println(Double.toString(this.totalPrice));
		return this.totalPrice;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(Products product) {
		this.products.add(product);
	}
	
	public Cart() {
		this.products = new ArrayList<Products>();
		this.discountedPrice = 0;
		this.totalPrice = 0;
		this.biggerDiscount = 0;
	}
	
}
