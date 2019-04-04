package com.app.dao;

import java.util.HashMap;

import com.app.bean.Product;

public interface Inventory {

	public void addNewProduct(Product product, boolean isPerishable);

	public void deleteProduct(String productId);

	public void modifyProduct(Product product);

	public Product getProduct(Product product);

	public HashMap<String, Product> getAllProducts();

}
