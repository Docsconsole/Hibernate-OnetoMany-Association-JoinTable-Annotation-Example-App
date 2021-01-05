package com.docsconsole.tutorials.hibernate5.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "BOOK_1")
@Getter
@Setter

public class Book {

	public Book() {
	}

	public Book( String bookName, Double bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOK_ID")
	private Long bookId;

	@Column(name = "BOOK_NAME")
	private String bookName;

	@Column(name = "BOOK_PRICE")
	private Double bookPrice;



}