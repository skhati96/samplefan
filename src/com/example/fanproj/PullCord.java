package com.example.fanproj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PullCord {

	private static final String REVERSE = "R";

	public static void main(String[] args) {
		System.out.println(args.length);
		MyFanPullCord1 cord1 = new MyFanPullCord1();
		MyFanPullCord2 cord2 = new MyFanPullCord2();
        while (true) {
            System.out.println("Pull cord");
            String s = readPullCord();
            if(s == null || s.isBlank() || s.isEmpty()) {
                System.out.println("String cannot be parsed, it is null or empty.");
                continue;
            }

            if (isNumeric(s)) {
            	cord1.pull();
            }
            else if (s.equalsIgnoreCase(REVERSE)) {
            	cord2.pull();
            } else {
            	System.out.println("Expected either an integer or a character R");
            }
            
        }
	}
	
    public static String readPullCord() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
        	line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
    
    public static boolean isNumeric(String str) {
	
        System.out.println(String.format("Parsing string: \"%s\"", str));
    		        
        try {
        	Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
            return false;
        }
    }
}
