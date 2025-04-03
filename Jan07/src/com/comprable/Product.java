package com.comprable;

public record Product(Integer productNumber, String productName, Double productPrice) implements Comparable<Product>
{
	@Override
	public int compareTo(Product p2) {
		return this.productName().compareTo(p2.productName);
	}

}
