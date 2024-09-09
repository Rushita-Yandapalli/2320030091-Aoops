package com.DP;
//TestCases
public class HomeTheatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Projector projector = new Projector();
   SoundSystem soundSystem = new SoundSystem();
   HomeTheatorFacade homeTheator = new HomeTheatorFacade(projector, soundSystem);
   homeTheator.watchMovie("Inception");
   homeTheator.endMovie();
	}

}
