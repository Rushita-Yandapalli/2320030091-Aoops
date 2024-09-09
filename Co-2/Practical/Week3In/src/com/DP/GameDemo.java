package com.DP;

public class GameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       GameState gameState = GameState.getInstance();
       System.out.println("Game Level :" +gameState.getLevel());
       EnemyFactory enemyFactory = new EasyEnemyFactory();
       Enemy enemy = enemyFactory.createEnemy();
       enemy.attack();
       GameItemFactory itemFactory = new ModernItemFactory();
       Weapon weapon = itemFactory.createWeapon();
       PowerUp powerUp = itemFactory.createPowerUp();
       weapon.use();
       powerUp.apply();
       gameState.setLevel(2);
       gameState.addScore(100);
       System.out.println("Updated Game Level :" + gameState.getLevel());
       System.out.println("Updated Score : " + gameState.getScore());
       
       
	}

}
