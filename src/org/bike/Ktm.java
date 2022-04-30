package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
System.out.println("Bike cost:56437");		
	}

	@Override
	public void speed() { 
System.out.println("Bike speed:350km/hr");		
	}
	public static void main(String[] args) {
		Ktm k=new Ktm();
		k.cost();
		k.speed();
	}

}
