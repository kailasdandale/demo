package com._27122022;
import java.io.*;
import java.util.*;

/*
 * 
 * The elements of a String are called characters.
 *  The number of characters in a String is called the length, 
 *  and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and ,
 perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than
  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line,
 separated by a space.
 */


public class Practice2 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
      int c=  A.length();
      int v=B.length();
      int d=c+v;
      System.out.println(d);
      if(A.compareTo(B)<0){
          System.out.println("No");
          A=A.substring(0,1).toUpperCase()+A.substring(1);
          B=B.substring(0,1).toUpperCase()+B.substring(1);
      }
      else {
    	 
    	  System.out.println("Yes");
          A=A.substring(0,1).toUpperCase()+A.substring(1);
          B=B.substring(0,1).toUpperCase()+B.substring(1);
      }
      
      System.out.println(A +" "+B);
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



