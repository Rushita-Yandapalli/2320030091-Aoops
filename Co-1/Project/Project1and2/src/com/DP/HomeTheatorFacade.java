package com.DP;

public class HomeTheatorFacade {
private Projector projector;
private SoundSystem soundSystem;
public HomeTheatorFacade(Projector projector, SoundSystem soundSystem) {
	this.projector = projector;
	this.soundSystem = soundSystem;
}
public void watchMovie(String movie) {
	System.out.println("Get ready to watch the movie:"+ movie);
	projector.on();
	projector.setInput("HDMI");
	soundSystem.on();
	soundSystem.setVolume(30);
	System.out.println("Movie is starting ... Enjoy!");
}
public void endMovie() {
	System.out.println("Shutting down movie theatre");
	projector.off();
	soundSystem.off();
}
}
