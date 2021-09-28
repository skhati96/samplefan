package com.example.fanproj;

class Clockwise implements Toggle {

	public void pull(MyFanPullCord2 cord2) {
		cord2.setDirection(new AntiClockwise());
		System.out.println("Direction revered to Anti Clockwise");
	}

}
