package com.example.fanjunit;

import static org.junit.Assert.*;
import org.junit.Test;

import com.example.fanproj.PullCord;

public class TestReadPullCordNotNull {

	// Test to assert if input line read is not null. Input of return is treated as blank so it is not null.

	@Test
	public void test() {
		String str = PullCord.readPullCord();
		assertNotNull(str);

	}

}
