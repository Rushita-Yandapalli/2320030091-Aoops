package com.DP;

public class LocalFileAdapter implements MusicSource {
private String fileName;
public LocalFileAdapter(String fileName) {
	this.fileName = fileName;
}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing local file:" + fileName);
	}

}
