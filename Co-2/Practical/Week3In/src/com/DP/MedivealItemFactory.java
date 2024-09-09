package com.DP;

public class MedivealItemFactory implements GameItemFactory {

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new Sword();
	}

	@Override
	public PowerUp createPowerUp() {
		// TODO Auto-generated method stub
		return new HealthBoost();
	}
}
