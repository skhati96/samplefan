package com.example.fanproj;

public class ChangeSpeed implements Speed {

	public String pull(MyFanPullCord1 cord1) {
		int ns;
		int cs = Integer.parseInt(cord1.getCurrentSpeed());
		int ms = Integer.parseInt(cord1.getMaxSpeed());

		if ( cs < ms ) {
			ns = cs + 1;
		} else {
			ns = 0;
		}
		// Speed is set to new incremented value
		cord1.setSpeed(String.valueOf(ns));
		System.out.println("Speed set to "+cord1.getCurrentSpeed());
		return cord1.getCurrentSpeed();	
	}

}
