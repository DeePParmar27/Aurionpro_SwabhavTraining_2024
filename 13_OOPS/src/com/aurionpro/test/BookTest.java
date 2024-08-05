package com.aurionpro.test;
import java.util.*;

import com.aurionpro.model.Book;


public class BookTest {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	Book books[] = new Book[4];
	
	for(int i = 0 ; i < books.length ; i++) {
	System.out.print("Enter Book Id:");
	int bookId = sc.nextInt() ;
	System.out.print("Enter Book Name:");
    String bookName = sc.next();
	System.out.print("Enter Book Author");
	String bookAuthor = sc.next() ;
	System.out.print("Enter Book Price:");
	double bookPrice = sc.nextDouble() ;
	System.out.print("Enter Book Publication:");
	String bookPublication = sc.next() ;
	
	 books[i] = new Book(bookId , bookName , bookAuthor , bookPrice ,bookPublication);
	}
	
	for(int i = 0 ; i < books.length ; i++) {
	System.out.println("Book ID : "+books[i].getBookId());
	System.out.println("Book Name : "+books[i].getName());
	System.out.println("Book Author : "+books[i].getAuthor());
	System.out.println("Book Price : "+books[i].getPrice());
	System.out.println("Book Publication : "+books[i].getPublication());
	System.out.println("-----------------------------------------------");
	}

	sortedByPrice(books);

	System.out.println("Sorted According to Price :-");
	System.out.println("-----------------------------");
	for(int i = 0 ; i < books.length ; i++) {
	System.out.println("Book ID : "+books[i].getBookId());
	System.out.println("Book Name : "+books[i].getName());
	System.out.println("Book Author : "+books[i].getAuthor());
	System.out.println("Book Price : "+books[i].getPrice());
	System.out.println("Book Publication : "+books[i].getPublication());
	System.out.println("-----------------------------------------------");
	}



	
}

private static void sortedByPrice(Book[] books) {
	for(int i = 0 ; i < books.length-1 ;i++) {
		for(int j = i+1 ; j < books.length ;j++) {
			if(books[i].getPrice() < books[j].getPrice()) {
				Book temp = books[i];
				books[i] = books[j];
				books[j] = temp ;
				
			}
		}
	}
	
}
}
