package be.icc.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Person {
	protected UUID id;
	private String name;
	private byte maxBooks;
	private LocalDate registrationDate;
	private List<Book> books;
	
	
	public UUID getId() {
		return id;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getMaxBooks() {
		return maxBooks;
	}

	public void setMaxBooks(byte maxBooks) {
		this.maxBooks = maxBooks;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public List<Book> getBooks() {
		return books;
	}

	public String toString() {
		final int maxLen = 3;
		return "Person [" + id + ": " + name + " (maxBooks=" + maxBooks + ", inscrit le "
		+ registrationDate + ")\n books="
		+ (books != null ? books.subList(0, Math.min(books.size(), maxLen)) : null) + "]";
		}
	
	public void borrows() {
		// TODO
	}

	public void returns() {
		// TODO
	}
	
	
}
