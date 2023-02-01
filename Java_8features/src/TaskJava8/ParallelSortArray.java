package TaskJava8;

import java.util.Arrays;

public class ParallelSortArray {

	public static void main(String[] args) {
	
		int arr[]= {102,45,33,48,87,65,2,1,3};
		
		System.out.println(Arrays.toString(arr));
		
	//	Arrays.parallelSort(arr);
		Arrays.parallelSort(arr,4,9);
		System.out.println(Arrays.toString(arr));
		 
	}
}
