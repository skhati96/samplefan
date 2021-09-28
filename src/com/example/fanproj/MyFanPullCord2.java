package com.example.fanproj;

class MyFanPullCord2 implements MyFanPullCord {
	private Toggle currentDirection;
	
	public MyFanPullCord2() {
		currentDirection = new Clockwise();
	}
	public void setDirection(Toggle t) {
		currentDirection =t;
	}
	public void pull() {
		currentDirection.pull(this);
	}

}
