package com.DP;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject{
	private List<Observer> bidders;
	String itemName;
	
	public Auction(String itemName) {
		this.bidders = new ArrayList<>();
		this.itemName = itemName;
	}

	@Override
	public void subscribe(Observer observer) {
		// TODO Auto-generated method stub
		bidders.add(observer);
		System.out.println(((Bidder) observer).getName() + "has subscribed to" + itemName + "auction.");
		
	}

	@Override
	public void unsubscribe(Observer observer) {
		// TODO Auto-generated method stub
		System.out.println(((Bidder) observer).getName() + "has unsubscribed from" + itemName + "auction.");
		
	}

	@Override
	public void notifyObservers(String message) {
		// TODO Auto-generated method stub
		for(Observer bidder : bidders) {
			bidder.update(message);
		}
		
	}
	public void startAuction() {
		notifyObservers("The auction for" + itemName + "has started!");
	}
		public void endAuction() {
			notifyObservers("The auction for" + itemName + "has ended!");
		}
	}


