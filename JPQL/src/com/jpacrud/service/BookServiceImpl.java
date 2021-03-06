package com.jpacrud.service;

import java.util.List;

import com.jpacrud.entities.Book;
import com.jpacrud.dao.BookDao;
import com.jpacrud.dao.BookDaoImpl;

public class BookServiceImpl implements BookService
{
	private BookDao dao;
	
	public BookServiceImpl()
	{
		dao = new BookDaoImpl();
	}
	
	@Override
	public Book getBookById(int id)
	{
		return dao.getBookById(id);
	}

	@Override
	public List<Book> getBookByTitle(String title)
	{
		return dao.getBookByTitle(title);
	}

	@Override
	public Long getBookCount()
	{
		return dao.getBookCount();
	}

	@Override
	public List<Book> getAuthorBooks(String author)
	{
		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Book> getAllBooks()
	{
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getBooksInPriceRange(int low, int high)
	{
		return dao.getBooksInPriceRange(low, high);
	}
}
