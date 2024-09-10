package com.DP;

public abstract class AuctionTemplate {
	protected Auction auction;
	public AuctionTemplate(Auction auction) {
		this.auction = auction;
	}
	public final void conductAuction() {
		notifyItemAvailable();
		startBidding();
		endBidding();
	}
	protected void notifyItemAvailable() {
		auction.notifyObservers("Item" + auction.itemName + "is now available for auction.");
		
	}
	protected abstract void startBidding();
	protected abstract void endBidding();

}
