// JPQL - Java Persistence Query Language

package com.jpacrud.client;

import com.jpacrud.entities.Book;
import com.jpacrud.service.BookService;
import com.jpacrud.service.BookServiceImpl;

public class Client
{
	public static void main(String[] args)
	{
		BookService service = new BookServiceImpl();
		
		System.out.println("Listing total number of books:");
		System.out.println("Total books = " + service.getBookCount());
		
		System.out.println("\nListing book with id=1:");
		System.out.println("Book(where id=1) = " + service.getBookById(1));
		
		System.out.println("\nListing All books:");
		for(Book book : service.getAllBooks())
		{
			System.out.println(book);
		}
		
		System.out.println("\nListing book written by Sadhguru:");
		for(Book book : service.getAuthorBooks("Sadhguru"))
		{
			System.out.println(book);
		}
		
		System.out.println("\nListing book on Karma:");
		for(Book book : service.getBookByTitle("Karma"))
		{
			System.out.println(book);
		}
		
		System.out.println("\nListing All books between 100 and 300:");
		for(Book book : service.getBooksInPriceRange(100, 300))
		{
			System.out.println(book);
		}
	}
}
