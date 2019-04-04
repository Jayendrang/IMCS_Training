package com.app.services;

import java.util.Date;
import java.util.HashMap;

import com.app.bean.NonPerishableProduct;
import com.app.bean.PerishableProduct;
import com.app.bean.Product;
import com.app.dao.Inventory;

public class InventoryManagementImpl implements Inventory {

	private static int productId;
	private static HashMap<String, PerishableProduct> perishableProductDB = new HashMap<String, PerishableProduct>();
	private static HashMap<String, NonPerishableProduct> nonPerishableProductDB = new HashMap<String, NonPerishableProduct>();

	@Override
	public void addNewProduct(Product product, boolean isPerishable) {
		productId++;
		if (isPerishable) {
			PerishableProduct preshable = new PerishableProduct(product.getProductId(), product.getProductName(),
					product.getProductCategory(), product.getProductType(), product.getStock(),
					product.getPricePerUnit(), new Date(2020, 12, 31), true);
			perishableProductDB.put(product.getProductName() + productId, preshable);

		} else {
			NonPerishableProduct nonpreshable = new NonPerishableProduct(product.getProductId(),
					product.getProductName(), product.getProductCategory(), product.getProductType(),
					product.getStock(), product.getPricePerUnit(), new Date(2020, 12, 31));
			nonPerishableProductDB.put(product.getProductName() + productId, nonpreshable);
		}

	}

	@Override
	public void deleteProduct(String product) {
		if (perishableProductDB.containsKey(product)) {
			perishableProductDB.remove(product);

		} else if (nonPerishableProductDB.containsKey(product)) {
			nonPerishableProductDB.remove(product);
		} else {
			System.out.println("Product not available");
		}
	}

	@Override
	public void modifyProduct(Product product) {
		if (perishableProductDB.containsKey(product.getProductId())) {
			PerishableProduct perishableProducts = perishableProductDB.get(product.getProductId());
			perishableProducts.setPricePerUnit(product.getPricePerUnit());
			perishableProducts.setStock(perishableProducts.getStock() + product.getStock());
			perishableProductDB.replace(perishableProducts.getProductId(), perishableProducts);

		} else if (nonPerishableProductDB.containsKey(product)) {
			NonPerishableProduct nonPerishableProduct = nonPerishableProductDB.get(product.getProductId());
			nonPerishableProduct.setPricePerUnit(product.getPricePerUnit());
			nonPerishableProduct.setStock(nonPerishableProduct.getStock() + product.getStock());
			nonPerishableProductDB.replace(nonPerishableProduct.getProductId(), nonPerishableProduct);
		} else {
			System.out.println("Product not available");
		}
	}

	@Override
	public Product getProduct(Product product) {
		if (perishableProductDB.containsKey(product.getProductId())) {
			return (Product) perishableProductDB.get(product);
		} else if (nonPerishableProductDB.containsKey(product.getProductId())) {
			return (Product) nonPerishableProductDB.get(product);
		}
		return null;
	}

	@Override
	public HashMap<String, Product> getAllProducts() {
		HashMap<String, Product> allProducts = new HashMap();
		allProducts.putAll(nonPerishableProductDB);
		allProducts.putAll(perishableProductDB);
		return allProducts;
	}

}
