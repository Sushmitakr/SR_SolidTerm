package com.stackroute.electricSwitch;

public class ElectricSwitch implements BulbInterface {
	
	boolean isON=false;
	Bulb bulb;

	public static void main(String args[]) {
		Bulb bulb1 = new Bulb(200, "CFL");
		
		ElectricSwitch electricSwitch1= new ElectricSwitch(bulb1);
		electricSwitch1.getCurrentStatus();
		electricSwitch1.switchOn();
		electricSwitch1.getCurrentStatus();

		electricSwitch1.switchOff();
		electricSwitch1.getCurrentStatus();

	}
	public ElectricSwitch(Bulb bulb) {
		// TODO Auto-generated constructor stub
		this.bulb=bulb;
	}
	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		isON=false;
		//System.out.println("BUlb is switched off");
	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		isON=true;
		//System.out.println("BUlb is switched on");
		
	}
	public void getCurrentStatus() {
		if (this.isON) 
			System.out.println("BUlb is switched on");
		 else
			System.out.println("BUlb is switched off");
		
		
	}

	
}
