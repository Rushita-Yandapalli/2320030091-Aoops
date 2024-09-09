package com.DP;

public class ReserveAuction extends AuctionTemplate{
private double reservePrice;
	public ReserveAuction(Auction auction, int i, double reservePrice) {
		super(auction);
		// TODO Auto-generated constructor stub
		this.reservePrice = reservePrice;
	}

	@Override
	protected void startBidding() {
		// TODO Auto-generated method stub
		auction.notifyObservers("The auction for" + auction.itemName + "with a reserve price of $" + reservePrice + "has started!");
	}

	@Override
	protected void endBidding() {
		// TODO Auto-generated method stub
		auction.notifyObservers("The auction for" + auction.itemName + "with a reserved Price of $" + reservePrice + "has ended!");
		
		
	}

}
