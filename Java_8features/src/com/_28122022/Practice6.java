package com._28122022;

import java.awt.print.Book;
import java.util.Scanner;

class MyBook extends Book {
	private String title;

	public void setTitle(String s) {
		this.title = s;
	}
}

public class Practice6 {

	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		//System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
	}	
	}