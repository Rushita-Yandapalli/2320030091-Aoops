package com.DP;

public class Bidder implements Observer{
	private String name;
	public Bidder(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(name + "received notification: " + message);
		
	}
	public String getName() {
		return name;
	}
}
