package com.DP;

public class RadioStationAdapter implements MusicSource {
private String stationName;
public RadioStationAdapter(String stationName) {
	this.stationName = stationName;
}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing radio station:" + stationName);
	}

}
