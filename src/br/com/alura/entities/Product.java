package br.com.alura.entities;

public class Product {

	public String name;
	public double price;

	public Product(final String name, final double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setPrice(final double price) {
		this.price = price;
	}

}
