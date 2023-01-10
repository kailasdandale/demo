package StramApi;

import java.util.Arrays;
import java.util.List;

public class Arr {

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
	//	b.sort((o,o2)->o.compareTo(o2));
		
		List<Integer> c= Arr.compareTriplets(a, b);
		System.out.println(c);
		
		
		/*
		 * int arr []= {17,28,30}; int arr2[]={99,16,8};
		 * 
		 * int alice = 0; int bob=0; for(int i=0;i<arr.length;i++){
		 * 
		 * if(arr[i]>arr2[i]) { alice++; } if(arr[i]<arr2[i]) { bob++; }
		 * 
		 * 
		 * } System.out.println(alice+":"+bob);
		 */
	}
}
