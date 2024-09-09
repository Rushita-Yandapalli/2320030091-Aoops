package com.DP;

public class VolumeControlDecorator extends MusicSourceDecorator{

	public VolumeControlDecorator(MusicSource decoratedMusicSource) {
		super(decoratedMusicSource);
		// TODO Auto-generated constructor stub
	}
	public void play() {
		super.play();
		setVolumeControl();
	}
	private void setVolumeControl() {
		System.out.println("Volume control applied.");
	}
	

}
