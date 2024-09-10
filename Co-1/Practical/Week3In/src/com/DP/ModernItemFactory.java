package com.DP;

public class ModernItemFactory implements GameItemFactory {

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new Gun();
	}

	@Override
	public PowerUp createPowerUp() {
		// TODO Auto-generated method stub
		return new SpeedBoost();
	}

}
