package com.csi.oops.constructorcore;

class Product {
	private int productId;

	private String productName;

	private double productPrice;

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

}

public class ConstructorResearch {

	public static void main(String[] args) {

		Product product = new Product(121, "MI SMART TV", 78000);

		product.setProductId(101);
		product.setProductName("APPLE PHONE");

		System.out.println(product);
	}

}
