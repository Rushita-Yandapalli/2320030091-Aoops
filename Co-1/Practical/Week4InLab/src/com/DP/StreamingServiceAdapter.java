package com.DP;

public class StreamingServiceAdapter implements MusicSource {
private String serviceName;
public StreamingServiceAdapter(String serviceName) {
	this.serviceName = serviceName;
}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Streaming music from:" + serviceName);
	}

}
