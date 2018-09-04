package com.stackroute.toyBuilder;

public class ToyCar implements Toy, movable {

	double price;
	String color;
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Toy Car starts moving");
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		this.price = price;
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public String toString() {
		return "price = "+ price + "color = " + color;
	}	

}
