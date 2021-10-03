package com.example.fanproj;

public class ChangeDirection implements Toggle {
	
	public static String C = "Clockwise";
	public static String AC = "AntiClockwise";
	
	public String pull(MyFanPullCord2 cord2) {
		// Direction is set to new incremented value
		if (cord2.getCurrentDirection().equalsIgnoreCase(C)) {
			cord2.setDirection(AC);
		} else if (cord2.getCurrentDirection().equalsIgnoreCase(AC)) {
			cord2.setDirection(C);
		} else {
			// Do nothing
		}
		System.out.println("Direction set to: "+cord2.getCurrentDirection());
		return cord2.getCurrentDirection();
	}

}
