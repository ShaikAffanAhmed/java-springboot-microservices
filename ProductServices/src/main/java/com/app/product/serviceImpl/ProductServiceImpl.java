package com.app.product.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.product.entity.Product;
import com.app.product.repository.ProductRepo;
import com.app.product.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductRepo productRepo;

	@Override
	public List<Product> getAllProduct() {
		return productRepo.findAll();
	}

	@Override
	public Product getById(Integer id) {
		Optional<Product> product = productRepo.findById(id);
		if (product.isPresent()) {
			return product.get();
		} else {
			return null;
		}
	}

	@Override
	public String deleteProductById(Integer id) {
		if(productRepo.existsById(id))
		{
			productRepo.deleteById(id);
			return "Product deleted successfully";
		}
		else {
			return "Failed to delete product";
		}
	}

}
