package com.DP;

public abstract class MusicSourceDecorator implements MusicSource {
 protected MusicSource decoratedMusicsource;
 public MusicSourceDecorator(MusicSource decoratedMusicSource) {
	 this.decoratedMusicsource = decoratedMusicSource;
 }
 public void play() {
	 decoratedMusicsource.play();
 }
}
