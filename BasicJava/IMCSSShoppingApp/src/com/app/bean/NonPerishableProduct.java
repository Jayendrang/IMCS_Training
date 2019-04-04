package com.app.bean;

import java.util.Date;

public class NonPerishableProduct extends Product {
	Date warrentyDate;

	public NonPerishableProduct() {
	}

	public NonPerishableProduct(String prodId, String prodName, String prodCat, String type, int stock, double ppu,
			Date expirydate) {
		super(prodId, prodName, prodCat, type, stock, ppu);
		this.warrentyDate = expirydate;

	}

	public Date getWarrentyDate() {
		return warrentyDate;
	}

	public void setWarrentyDate(Date warrentyDate) {
		this.warrentyDate = warrentyDate;
	}

}
