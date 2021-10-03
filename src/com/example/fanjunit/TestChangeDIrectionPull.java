package com.example.fanjunit;

import com.example.fanproj.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestChangeDIrectionPull {

	String currDirection = "Clockwise";
	MyFanPullCord2 cord2 = new MyFanPullCord2();
	ChangeDirection cs = new ChangeDirection();

	@Test
	public void test() {
		cord2.setDirection(currDirection);
		assertEquals("AntiClockwise", cs.pull(cord2));
		cord2.setDirection(cord2.getCurrentDirection());
		assertEquals("Clockwise", cs.pull(cord2));
	}
}
