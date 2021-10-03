package com.example.fanproj;

public class PullCord {

	public static void main(String[] args) {

		try {
			MyFanPullCord1 cord1 = new MyFanPullCord1();
			MyFanPullCord2 cord2 = new MyFanPullCord2();

			System.out.println(
					"Inside main: All property names - " + ExtConfigProperites.getInstance().getAllPropertyNames());

			// Pull cord1 and test repetitively
			int ms = Integer.parseInt(ExtConfigProperites.getInstance().getProperty("MaxSpeed"));
			String maxSpeed = ExtConfigProperites.getInstance().getProperty("MaxSpeed");
			String currSpeed = ExtConfigProperites.getInstance().getProperty("CurrentSpeed");
			System.out.println("Let us test the Speed cord now......... ");
			System.out.println("MaxSpeed = " + maxSpeed);
			System.out.println("CurrentSpeed = " + currSpeed);

			cord1.setMaxSpeed(maxSpeed);
			cord1.setSpeed(currSpeed);
			for (int i = 0; i <= ms; i++) {
				System.out.println("Pull cord one to change speed");
				String newSpeed = cord1.pull(cord1.getCurrentSpeed());
				ExtConfigProperites.getInstance().setProperty("CurrentSpeed", newSpeed);
			}
			// Pull cord2 and test repetitively
			String currDirection = ExtConfigProperites.getInstance().getProperty("CurrentDirection");
			System.out.println("Let us test the direction cord now......... ");
			System.out.println("CurrentDirection = " + currDirection);
			cord2.setDirection(currDirection);
			for (int i = 0; i < 2; i++) {
				System.out.println("Pull cord two to change direction");
				String newDirection = cord2.pull(cord2.getCurrentDirection());
				ExtConfigProperites.getInstance().setProperty("CurrentDirection", newDirection);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
