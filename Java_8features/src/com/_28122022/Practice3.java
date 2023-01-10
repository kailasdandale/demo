package com._28122022;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
Generic methods are a very efficient way to handle multiple
 datatypes using a single method. This problem will test your
  knowledge on Java Generic methods.

Let's say you have an integer array and a string array.
 You have to write a single method printArray that can 
 print all the elements of both arrays. The method should
  be able to accept both integer arrays or string arrays 
 */
public class Practice3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        List l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("Hello");
        l.add("World");
        
     Iterator i=   l.iterator();
     while(i.hasNext()){
         Object o=i.next();
         if(o instanceof Integer){
             int j=(int)o;
             System.out.println(j);
         }
         if(o instanceof String){
             String s=(String)o;
             System.out.println(s);
         }
     }
        
        
    }
}