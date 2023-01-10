package com._23122022;


/*
   #
  ##
 ###
####

*/

public class Practice6 {

	 public static void printStars(int size) 
	    { 
		 
		    
		    for (int i = 0; i < size; i++) {
		      
		      for (int j = 1; j < size - i; j++) {
		        System.out.print(" ");
		      }
		      
		      for (int k = 0; k <= i; k++) {
		        System.out.print("#");
		      }
		      System.out.println();
		    }
	        } 
	    
	public static void main(String[] args) { 
		printStars(6) ;
     
        
    } 
		
}	
	

