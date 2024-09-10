package com.DP;

public class StandardAuction extends AuctionTemplate{

	public StandardAuction(Auction auction) {
		super(auction);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void startBidding() {
		// TODO Auto-generated method stub
		auction.startAuction();
	}

	@Override
	protected void endBidding() {
		// TODO Auto-generated method stub
		auction.endAuction();
	}
	

}
