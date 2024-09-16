package com.dp;

public class BirdManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird sparrow = new Bird();
		Bird ostrich = new Ostrich();
		Bird crow = new Crow();
		System.out.println("Crow:");
		crow.fly();
		System.out.println("Sparrow:");
		sparrow.fly();
		System.out.println("Ostrich:");
		try {
			ostrich.fly();
		}catch (UnsupportedOperationException e){
			System.out.println(e.getMessage());
			
		}
		

	}

}
