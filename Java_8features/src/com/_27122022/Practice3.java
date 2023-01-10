package com._27122022;

import java.util.Scanner;


/*
 * welcometojava
3
7
come
 */
public class Practice3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String substring = s.substring(start, end);
        
        System.out.println(substring);
        
    }
}