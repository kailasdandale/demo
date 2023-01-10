package com._28122022;
import java.io.*;
import java.util.*;

public class Practice9 {

	private  static	int b,h;
	private static boolean f=false;
	
	static {
		Scanner c=new Scanner(System.in);
		b=c.nextInt();
		h=c.nextInt();
		if(b>0 && h>0) {
			 f=true;
		}
		else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    	if(f) {
  
       int area=b*h;
       System.out.println(area);
        
    	}
    }
}