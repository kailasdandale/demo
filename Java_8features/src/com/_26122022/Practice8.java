package com._26122022;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice8 {

	public static String timeConversion(String s) throws ParseException {
		// Write your code here

		SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat t = new SimpleDateFormat("hh:mm:ss a");

		Date parse = t.parse(s);
		String ss = d.format(parse);
		
		return ss;

	}

	public static void main(String[] args) throws ParseException {

		String conversion = timeConversion("07:05:45 PM");

		System.out.println(conversion);
	}

}
