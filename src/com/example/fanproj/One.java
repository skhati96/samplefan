package com.example.fanproj;

class One implements Speed {
	
	public void pull(MyFanPullCord1 cord1) {
		cord1.setSpeed(new Two());
		System.out.println("Speed set to Speed 2");
	}

}
