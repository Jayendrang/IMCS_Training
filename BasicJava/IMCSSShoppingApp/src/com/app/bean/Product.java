package com.app.bean;

public class Product {

	String productName, productCategory, productType,productId;
	double pricePerUnit;
	int stock;

	public Product() {

	}

	public Product(String prodId, String prodName, String prodCat, String type, int stock, double ppu) {
		this.productId = prodId;
		this.productName = prodName;
		this.productCategory = prodCat;
		this.productType = type;
		this.stock = stock;
		this.pricePerUnit = ppu;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
