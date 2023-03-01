package com.testapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testapp.entity.Product;
import com.testapp.repository.ProductRepository;
import com.testapp.service.ProductService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ProductController {
	
	     @Autowired
	     private ProductService productService;
	     
	     @Autowired
	     private ProductRepository productRepository;

	     @GetMapping("/allproducts")
		    public List<Product> getAllProducts(){
	    	 List<Product> allproducts = productRepository.findAll();
			 return allproducts; 
		   }
	     
	   @GetMapping("/{id}")
	    public Product getProduct(@PathVariable("id") long id) {
		   return this.productService.getProductById(id);
	   }
	   
	   @PostMapping("/post")
	   public String list(@RequestBody Product product) {
		    productService.saveProduct(product);
		    return "added";
	   }
		   
	    @PutMapping("/update")
	    public Product update(@RequestBody Product product ) {
	    	return productService.updateProduct(product);
	    }
	   
//	    @PutMapping("/edit/{id}")
//	    public String edit(@PathVariable long id, Model model) {
//	        model.addAttribute("product", productService.getProductById(id));
//	        return "product form";
//	    }



	    @DeleteMapping("deleteproduct/{id}")
	    public String delete(@PathVariable long id) {
	        productService.deleteProduct(id);
	        return "redirect:/products";
	    }
	    
	    
	    
}
