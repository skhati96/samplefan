package com.example.fanjunit;

import com.example.fanproj.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestChangeSpeedPull {

	String maxSpeed = "5";
	String currSpeed1 = "0";
	MyFanPullCord1 cord1 = new MyFanPullCord1();
	ChangeSpeed cs = new ChangeSpeed();

	@Test
	public void test() {
		cord1.setMaxSpeed(maxSpeed);
		cord1.setSpeed(currSpeed1);
		for (int i = 0; i <= Integer.parseInt(maxSpeed); i++) {
			if (i < Integer.parseInt(maxSpeed)) {
				assertEquals(i + 1, Integer.parseInt(cs.pull(cord1)));
			} else {
				assertEquals(0, Integer.parseInt(cs.pull(cord1)));
			}

		}
	}
}
