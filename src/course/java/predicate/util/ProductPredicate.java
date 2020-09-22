package course.java.predicate.util;

import java.util.function.Predicate;

import course.java.comparator.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
