package course.java.function.util;

import java.util.function.Function;

import course.java.comparator.entities.Product;

public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
	
}
