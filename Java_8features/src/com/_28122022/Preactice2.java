package com._28122022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Preactice2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner c=new Scanner(System.in);
        System.out.println("enter number");
        int n=c.nextInt();
        List<Integer>l=new ArrayList<>();
        
    //	System.out.println("enter numbers");
        for(int i=0;i<n;i++){
        	int k = c.nextInt();
            l.add(k);
        }
    //    System.out.println(l);
    //    System.out.println("enter inex and value");
        
        int b=c.nextInt();
        l.add(b, c.nextInt());
       // System.out.println("enter inex to delete");
        l.remove(c.nextInt());
        System.out.println(l);
    }
}