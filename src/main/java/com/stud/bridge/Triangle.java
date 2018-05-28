package com.stud.bridge;

public class Triangle extends Shape {
	public Triangle(Color color) {
		super(color);
	}
	
	public void applyColor() {
		color.applyColor();
	}
}
