package course.java.functionCreate.model.service;

import java.util.List;

import course.java.comparator.entities.Product;

public class ProductService {

	public double filteredSum(List<Product> list) {
		double sum = 0.0;
		for (Product p : list) {
			if (p.getName().charAt(0) == 'T') {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
