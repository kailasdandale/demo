package com._27122022;
import java.util.Scanner;

public class Practice4 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        smallest  = s.substring(0, k);
        
        largest= s.substring(s.length()-k);
        
         
         
         
         //welcometojava
         //3
			/*
			 * for(int i=k;i<s.length();i++) { str=str.substring(1, k)+s.charAt(i);
			 * if(largest.compareTo(str)<0) { largest=str; } if(smallest.compareTo(str)>0) {
			 * smallest=str; } }
			 */
        
        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}