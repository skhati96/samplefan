package com.example.fanproj;

public class MyFanPullCord2 implements MyFanPullCord {
	private String currentDirection;
	private Toggle changeDirection;
	
	public MyFanPullCord2() {
		currentDirection = new String();
		changeDirection = new ChangeDirection();
	}
	public void setDirection(String sd) {
		currentDirection = sd;
	}
	public String getCurrentDirection() {
		return currentDirection;
	}
	public String pull(String d) {
		return changeDirection.pull(this);
	}

}
