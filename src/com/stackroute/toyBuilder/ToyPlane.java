package com.stackroute.toyBuilder;

public class ToyPlane implements Toy,flyable,movable {

	double price;
	String color;
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Toy Plane is flying");
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

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Toy Plane is moving");
	}
	
	
	
}
