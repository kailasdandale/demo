package com._23122022;

import java.util.Arrays;
import java.util.List;




public class Practice2 {

	
		 public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		        int[] arr = a.stream()
		                              .mapToInt(Integer::intValue)
		                              .toArray();
		         int[] arr2 = b.stream()
		                              .mapToInt(Integer::intValue)
		                              .toArray();                     
		 
		        int alice=0;
		        int bob=0;
		        for(int i=0;i<arr.length;i++){
		            
		            
		                
		                if(arr[i]>arr2[i]){
		                   alice++;
		                    
		                }
		                if(arr[i]<arr2[i]){
		                   bob++;
		                    
		                }
		            
		        }
		 
		    List<Integer>l=Arrays.asList(alice,bob);
		    return l;
		 
		 
		 
		    } 
		
		 
		public static void main(String[] args) {
			
			List<Integer>a=Arrays.asList(17,28,30);
			List<Integer>b=Arrays.asList(99,16,8);
			
			
			List<Integer> c= Practice2.compareTriplets(a, b);
			System.out.println(c);
			
			
			
		}
	

	
}
