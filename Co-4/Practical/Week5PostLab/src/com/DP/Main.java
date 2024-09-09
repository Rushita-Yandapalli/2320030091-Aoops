package com.DP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Auction auction = new Auction("Vintage Car");
Observer bidder1 = new Bidder("Alice");
Observer bidder2 = new Bidder("Bob");
auction.subscribe(bidder1);
auction.subscribe(bidder2);
AuctionTemplate StandardAuction = new StandardAuction(auction);
StandardAuction.conductAuction();
auction.unsubscribe(bidder1);
AuctionTemplate reserveAuction = new ReserveAuction(auction, 50000, 0);
reserveAuction.conductAuction();
	}

}
