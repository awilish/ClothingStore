package purchase;

import java.time.LocalDate;
import java.util.Date;

import products.Jacket_Trouser_Sizes;
import products.Products;
import products.Shirt_Sizes;
import products.Shirts;
import products.Trousers;
import cart.Cart;
import cashier.Cashier;

public class Purchase {
	public static void main(String[] args) {
		
		Shirts shirt1 = new Shirts(Shirt_Sizes.M,"Blue Cotton Shirt", "BrandS", 14.99, "blue");
		Shirts shirt2 = new Shirts(Shirt_Sizes.M,"White Cotton Shirt", "BrandS", 15.99, "white");
		Trousers trousers1 = new Trousers(Jacket_Trouser_Sizes.fifty, "Black Cotton Trousers", "BrandT", 29.99, "black");
		
		Cart cart = new Cart();
		cart.setProducts(shirt1);
		cart.setProducts(shirt2);
		cart.setProducts(trousers1);
		Cashier cashier = new Cashier(cart, LocalDate.now());
		cashier.printReceipt();
	}
	
	
	
	
}
