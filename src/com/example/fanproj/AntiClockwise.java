package com.example.fanproj;

class AntiClockwise implements Toggle {

	public void pull(MyFanPullCord2 cord2) {
		cord2.setDirection(new Clockwise());
		System.out.println("Direction revered to Clockwise");
	}

}
