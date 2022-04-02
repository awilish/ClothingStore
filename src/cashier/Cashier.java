package cashier;

import java.time.LocalDate;
import java.util.Date;

import cart.Cart;

public class Cashier {
	private Cart cart;
	private double cartPrice;
	private LocalDate date;
	private int disc;
	private double discount;
	private double discountedCart;

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	public double returnPrice() {
		String day = LocalDate.now().getDayOfWeek().name();
		
		if ((day == "TUESDAY") && (this.cart.returnSize() > 2))
		{
			this.discountedCart = this.cart.getBiggerDiscount();
			disc = 3;
		}
		else if (day == "TUESDAY") {
			this.discountedCart = this.cart.getDiscountedPrice();
			disc = 1;
		}
		else if (this.cart.returnSize() > 2) {
			this.discountedCart = this.cart.getTotalPrice()*0.8;
			this.cart.getProducts().forEach(p -> {
				p.applySizeDiscount();
			});
			disc = 2;
			//System.out.println("this");
		} else {
			this.discountedCart = this.cart.getTotalPrice();
			disc = 0;
		}
		
		

		System.out.println(Double.toString(this.cartPrice));
		return this.discountedCart;
	}
	
	public void calculateDiscount() {
		this.cart.getProducts().forEach((p) -> {
			//System.out.println(p.getAppliedDiscount());
			this.discount += (p.getDiscountPrice());
		});
	}
	
	public void printReceipt() {
		this.calculateDiscount();
		this.discountedCart = this.returnPrice();
		System.out.println("Date: " + this.date.toString());
		System.out.println("---Products---");
		this.cart.getProducts().forEach((p) -> {
			System.out.println(p.getName() + " - " + p.getBrand());
			System.out.println(p.getPrice());
			System.out.println("#discount " + Integer.toString(p.getAppliedDiscount()) + "% - " + "$" + Double.toString(p.getDiscountPrice()));
		});
		System.out.println("SUBTOTAL: $" + Double.toString(this.cart.getTotalPrice()));
		System.out.println("DISCOUNT: -$" + Double.toString(this.discount));
		System.out.println("TOTAL: $" + this.discountedCart);
	}
	
	public Cashier(Cart cart, LocalDate date) {
		this.cart = cart;
		this.date = date;
	}
	

}
