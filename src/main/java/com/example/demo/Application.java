package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Book;
import com.example.demo.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ccxt = SpringApplication.run(Application.class, args);
		BookRepository repo = ccxt.getBean(BookRepository.class);

		/*
		 * SaveAll Method Book b1 = new Book(); b1.setBookId(102);
		 * b1.setBookName("Angular"); b1.setBookPrice(2000.00);
		 * 
		 * Book b2 = new Book(); b2.setBookId(103); b2.setBookName("Vue");
		 * b2.setBookPrice(1500.00);
		 * 
		 * repo.saveAll(Arrays.asList(b1,b2));
		 */
		/*
		 * Existsby method boolean status = repo.existsById(102);
		 * System.out.println(status);
		 */

		/*
		 * findbyid method Optional<Book> findById = repo.findById(103);
		 * if(findById.isPresent()) { System.out.println(findById.get()); }
		 */
		/*
		 * findAllById method Iterable<Book> findAllById =
		 * repo.findAllById(Arrays.asList(101,102)); for(Book b : findAllById) {
		 * System.out.println(b); }
		 */
		/*
		 * Custom findBy methods List<Book> books =
		 * repo.findByBookPriceGreaterThanEqual(1500.00); for(Book b : books) {
		 * System.out.println(b); }
		 */

		/* Custom Query HQL */
		List<Book> books = repo.getAll();
		for (Book b : books) {
			System.out.println(b);
		}

	}

}