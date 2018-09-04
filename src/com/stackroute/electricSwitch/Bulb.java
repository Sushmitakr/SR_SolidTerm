package com.stackroute.electricSwitch;

public class Bulb implements BulbInterface{
	private int bulbPower;
	private String bulbType;
	
	public Bulb(int bulbPower, String bulbTYpe) {
		this.setBulbPower(bulbPower);
		this.setBulbType(bulbTYpe);
	}
	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		
	}
	public int getBulbPower() {
		return bulbPower;
	}
	public void setBulbPower(int bulbPower) {
		this.bulbPower = bulbPower;
	}
	public String getBulbType() {
		return bulbType;
	}
	public void setBulbType(String bulbType) {
		this.bulbType = bulbType;
	}
}
