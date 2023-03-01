package com.testapp.service;

import com.testapp.entity.Product;

public interface ProductService {

	 Iterable<Product> listAllProducts();

	    Product getProductById(long id);

	    Product saveProduct(Product product);
	    
	    Product updateProduct(Product product);

	    void deleteProduct(long id);
}
