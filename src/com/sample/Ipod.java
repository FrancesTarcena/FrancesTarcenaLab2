package com.sample;

public class Ipod {
	private String storageCapacity;
	private String resolution;
	private String batteryLife;
	private String song;
	
	public Ipod(String storageCapacity, String resolution, String batteryLife) {
		this.storageCapacity = storageCapacity;
		this.resolution = resolution;
		this.batteryLife = batteryLife;
	}
	
	public String setSong(String song) {
		return this.song = song;
	}
	
	public String getSong() {
		return this.song;
	}
}
