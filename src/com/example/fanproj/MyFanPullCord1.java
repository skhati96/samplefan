package com.example.fanproj;

class MyFanPullCord1 implements MyFanPullCord {
	private Speed currentSpeed;
	
	public MyFanPullCord1() {
		currentSpeed = new Zero();
	}
	public void setSpeed(Speed s) {
		currentSpeed =s;
	}
	public void pull() {
		currentSpeed.pull(this);
	}

}
