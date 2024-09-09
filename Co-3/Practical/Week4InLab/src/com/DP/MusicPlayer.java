package com.DP;

public class MusicPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MusicSource localFile = new LocalFileAdapter("song.mp3");
    localFile.play();
    System.out.println();
    
    MusicSource streamingService = new StreamingServiceAdapter("Wynk");
    streamingService.play();
    System.out.println();
    
    MusicSource radioStation = new RadioStationAdapter("Radio One");
    radioStation.play();
    System.out.println();
    
    MusicSource decoratedLocalFile = new VolumeControlDecorator(new EqualizerDecorator(new LocalFileAdapter("song.mp3")));
    decoratedLocalFile.play();
	}

}
