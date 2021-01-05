package com.docsconsole.tutorials.hibernate5.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "author_book_1")
@Getter
@Setter
public class AuthorBook {
	public AuthorBook() {
	}

	public AuthorBook(long authorBookId, long authorId, long bookId) {
		this.authorBookId = authorBookId;
		this.authorId = authorId;
		this.bookId = bookId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AUTHOR_BOOK_ID")
	private long authorBookId;

	@Column(name = "AUTHOR_ID")
	private long authorId;

	@Column(name = "BOOK_ID")
	private long bookId;

}