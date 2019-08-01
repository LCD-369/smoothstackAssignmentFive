package com.louis;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
	    File file = new File("/Users/louiscdiaz/Desktop");
	    String[] fileList = file.list();
	        for(String filename:fileList) {
	            System.out.println(filename);
	        	}

	

}
}