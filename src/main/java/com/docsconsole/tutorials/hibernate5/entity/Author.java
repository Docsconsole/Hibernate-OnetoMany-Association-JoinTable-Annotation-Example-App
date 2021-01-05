package com.docsconsole.tutorials.hibernate5.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "AUTHOR_1")
@Getter
@Setter
@AllArgsConstructor
public class Author {

	public Author() {
	}

	public Author(String authorName) {
		this.authorName = authorName;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AUTHOR_ID")
	private long authorId;

	@Column(name = "AUTHOR_NAME")
	private String authorName;

	@OneToMany(cascade= CascadeType.ALL)
	@JoinTable(name="author_book_1", joinColumns={@JoinColumn(name="AUTHOR_ID", referencedColumnName="AUTHOR_ID")}
			, inverseJoinColumns={@JoinColumn(name="BOOK_ID", referencedColumnName="BOOK_ID")})
	private Set<Book> Books;

}