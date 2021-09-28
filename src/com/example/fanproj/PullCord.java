package com.example.fanproj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PullCord {

	private static final String REVERSE = "R";

	public static void main(String[] args) {
		MyFanPullCord1 cord1 = new MyFanPullCord1();
		MyFanPullCord2 cord2 = new MyFanPullCord2();
        while (true) {
            System.out.println("Pull cord");
            String s = getLine();
            if (isNumeric(s)) {
            	cord1.pull();
            }
            else if (s.equalsIgnoreCase(REVERSE)) {
            	cord2.pull();
            }
            
        }
	}
	
    static String getLine() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
        	line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
    
    static boolean isNumeric(String string) {
	
        System.out.println(String.format("Parsing string: \"%s\"", string));
    		
        if(string == null || string.equals("")) {
            System.out.println("String cannot be parsed, it is null or empty.");
            return false;
        }
        
        try {
        	Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }
}
