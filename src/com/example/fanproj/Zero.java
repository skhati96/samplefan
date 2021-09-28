package com.example.fanproj;

class Zero implements Speed {

	public void pull(MyFanPullCord1 cord1) {
		cord1.setSpeed(new One());
		System.out.println("Speed set to Speed 1");
	}

}
