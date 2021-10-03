package com.example.fanproj;

public class MyFanPullCord1 implements MyFanPullCord {
	private String maxSpeed;
	private String currentSpeed;
	private Speed changeSpeed;
	
	public MyFanPullCord1() {
		maxSpeed = new String();
		currentSpeed = new String();
		changeSpeed = new ChangeSpeed();
	}
	public void setMaxSpeed(String ms) {
		maxSpeed = ms;
	}
	public void setSpeed(String cs) {
		currentSpeed = cs;
	}
	public String getMaxSpeed() {
		return maxSpeed;
	}
	public String getCurrentSpeed() {
		return currentSpeed;
	}
	public String pull(String s) {
		return changeSpeed.pull(this);
	}

}
