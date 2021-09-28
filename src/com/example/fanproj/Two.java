package com.example.fanproj;

class Two implements Speed {

	public void pull(MyFanPullCord1 cord1) {
		cord1.setSpeed(new Three());
		System.out.println("Speed set to Speed 3");
	}

}
