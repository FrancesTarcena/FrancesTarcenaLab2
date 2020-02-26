package com.sample;

public class Iphone extends Ipod {
	private double camera;
	private String photo;
	private String time;
	
	public Iphone(String storageCapacity, String resolution, String batteryLife, double camera) {
		super(storageCapacity, resolution, batteryLife);
		this.camera = camera;
		this.photo = photo;
	}
	
	public String setAlarm(String time) {
		return this.time = time;
	}
	
	public String getAlarm() {
		return this.time;
	}
	
	public String setPhoto(String photo) {
		return this.photo = photo;
	}

	public String getPhoto() {
		return this.photo;

}
	
}
