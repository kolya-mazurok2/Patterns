package com.stud.visitor;

public class Fruit implements ItemElement {
	private int pricePerKg;
	private int weight;
	private String name;
	
	public Fruit(int price, int weight, String name) {
		this.pricePerKg = price;
		this.weight = weight;
		this.name = name;
	}
	
	public int getPricePerKg() {
		return pricePerKg;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getName() {
		return name;
	}
	
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}
