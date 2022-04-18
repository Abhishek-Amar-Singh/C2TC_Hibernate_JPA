package com.jpacrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.jpacrud.entities.Book;

public class BookDaoImpl implements BookDao
{
	private EntityManager entityManager;

	public BookDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Book getBookById(int id)
	{
		Book book = entityManager.find(Book.class, id);
		return book;
	}

	@Override
	public List<Book> getBookByTitle(String title)
	{
		String queryString = "SELECT book FROM Book book WHERE book.title LIKE :mtitle";
		TypedQuery<Book> query = entityManager.createQuery(queryString, Book.class);
		query.setParameter("mtitle", "%"+title+"%");
		return query.getResultList();
	}

	@Override
	public Long getBookCount()
	{
		String queryString = "SELECT COUNT(book.id) FROM Book book";
		TypedQuery<Long> query = entityManager.createQuery(queryString, Long.class);
		Long count = query.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getAuthorBooks(String author)
	{
		String queryString = "SELECT book FROM Book book WHERE book.author=:mAuthor";
		TypedQuery<Book> query = entityManager.createQuery(queryString, Book.class);
		query.setParameter("mAuthor", author);
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	@Override
	public List<Book> getAllBooks()
	{
		Query query = entityManager.createNamedQuery("getAllBooks");
		@SuppressWarnings("unchecked")
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	@Override
	public List<Book> getBooksInPriceRange(int low, int high)
	{
		String queryString = "SELECT book FROM Book book WHERE book.price between :low and :high";
		TypedQuery<Book> query = entityManager.createQuery(queryString, Book.class);
		query.setParameter("low", low);
		query.setParameter("high", high);
		List<Book> bookList = query.getResultList();
		return bookList;
	}
}
