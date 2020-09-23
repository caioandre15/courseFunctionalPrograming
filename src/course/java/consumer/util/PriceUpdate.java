package course.java.consumer.util;

import java.util.function.Consumer;

import course.java.comparator.entities.Product;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
