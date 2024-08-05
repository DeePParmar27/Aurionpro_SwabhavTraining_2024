package com.aurionpro.list.model;

import java.util.Comparator;

public class LibraryComparator {

	public static class titleComparator implements Comparator<Library> {

		@Override
		public int compare(Library book1, Library book2) {
			return book1.getTitle().compareTo(book2.getTitle());
		}

	}
	public static class authorComparator implements Comparator<Library> {

		@Override
		public int compare(Library book1, Library book2) {
			return book1.getAuthor().compareTo(book2.getAuthor());
		}

	}
	public static class priceComparator implements Comparator<Library> {

		@Override
		public int compare(Library book1, Library book2) {
			return (int) (book1.getPrice() - book2.getPrice());
		}

	}
	public static class publicationYearComparator implements Comparator<Library> {

		@Override
		public int compare(Library book1, Library book2) {
			return book1.getPublicationYear() - book2.getPublicationYear();
		}

	}

}
