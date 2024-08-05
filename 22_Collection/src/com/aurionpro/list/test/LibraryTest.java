package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.aurionpro.list.model.Library;
import com.aurionpro.list.model.LibraryComparator;

public class LibraryTest {
	public static void main(String[] args) {
		
		List<Library> library = new ArrayList<>();
		library.add(new Library("Harry_Potter", "JK_Rowling", 1000, 2001));
		library.add(new Library("Lucifer", "devil", 1200, 2010));
		library.add(new Library("Stranger_Things", "DD_Brother", 1000, 2017));
		library.add(new Library("Suits", "Harvy_Specter", 1000, 2019));
		
		Collections.sort(library , new LibraryComparator.authorComparator().thenComparing(new LibraryComparator.titleComparator()).thenComparing(new LibraryComparator.priceComparator()));
	//	Collections.sort(library , new LibraryComparator.publicationYearComparator().thenComparing(new LibraryComparator.priceComparator()).thenComparing(new LibraryComparator.authorComparator()));

	booksDisplay(library);

		
	}

	private static void booksDisplay(List<Library> library) {
		for(Library books : library) {
			System.out.println(books);
			System.out.println("");
		}
		
	}


	}


