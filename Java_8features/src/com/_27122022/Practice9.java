package com._27122022;

import java.util.Scanner;
//create array and print //
public class Practice9 {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scan.nextInt();
        
        int a[]=new int[n];
        
        for(int i=0;i<a.length;i++){
          a[i]=scan.nextInt();
        }
        
        
        
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}