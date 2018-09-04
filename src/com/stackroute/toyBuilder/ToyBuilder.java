package com.stackroute.toyBuilder;

public class ToyBuilder {

		public static ToyCar buildToyCar() {
			ToyCar toyCar = new ToyCar();
			toyCar.setPrice(56.50);
			toyCar.setColor("Red");
			toyCar.move();
			return toyCar;
		}
		
		public static ToyPlane buildToyPlane() {
			ToyPlane toyPlane = new ToyPlane();
			toyPlane.setPrice(1500.60);
			toyPlane.setColor("White");
			toyPlane.move();
			return toyPlane;
		}
	}

