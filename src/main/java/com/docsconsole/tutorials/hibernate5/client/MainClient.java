package com.docsconsole.tutorials.hibernate5.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.docsconsole.tutorials.hibernate5.entity.Author;
import com.docsconsole.tutorials.hibernate5.entity.Book;
import com.docsconsole.tutorials.hibernate5.util.HibernateUtil;

public class MainClient {
	
	public static void main(String[] args) {

		System.out.println("Main method@MainClient");

		// obtains the session
		Author author = new Author("Author1");


		Book book1 = new Book("Book1", 100.0);
		Book book2 = new Book("Book2", 200.0);
		Book book3 = new Book("Book3", 300.0);

		Set<Book> books = new HashSet<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);

		author.setBooks(books);

		try {

			// Get Session
			Session session = HibernateUtil.getSessionFactory().openSession();

			System.out.println("Session is created");
			// start transaction
			Transaction tx = session.beginTransaction();

			// Save the Model objects
			session.save(author);


			session.getTransaction().commit();
			session.close();
			System.out.println("Session is closed");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}