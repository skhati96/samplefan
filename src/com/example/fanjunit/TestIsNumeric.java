package com.example.fanjunit;

import static org.junit.Assert.*;
import org.junit.Test;

import com.example.fanproj.PullCord;

public class TestIsNumeric {

	// Multiple values are tested to check if Numeric or not. Parameterized Test is available in JUnit 5 to simplify the below.
	String s1 = "T";
	String s2 = "Rsas";
	String s3 = "r";
	String s4 = "$";
	String s5 = "2";
	String s6 = "62";
	
	@Test
	public void test() {
		System.out.println(PullCord.isNumeric(s1));
		assertFalse(PullCord.isNumeric(s1));
		assertFalse(PullCord.isNumeric(s2));
		assertFalse(PullCord.isNumeric(s3));
		assertFalse(PullCord.isNumeric(s4));
		assertTrue(PullCord.isNumeric(s5));
		assertTrue(PullCord.isNumeric(s6));
	}

}
