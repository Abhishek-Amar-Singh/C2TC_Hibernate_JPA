package com.jpacrud.dao;

import java.util.List;

import com.jpacrud.entities.Book;

public interface BookDao
{
	public abstract Book getBookById(int id);

	public abstract List<Book> getBookByTitle(String title);

	public abstract Long getBookCount();

	public abstract List<Book> getAuthorBooks(String author);

	public abstract List<Book> getAllBooks();

	public abstract List<Book> getBooksInPriceRange(int low, int high);
}
