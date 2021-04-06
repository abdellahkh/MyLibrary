package be.icc.poo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyLibrary {
	private String name;
	private List<Book> books;
	private List<Person> people;
	
	public MyLibrary(String name) {
		this.name = name;
		this.books = new ArrayList<Book>();
		this.people = new ArrayList<Person>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBooks() {
		return books;
	}
	public List<Person> getPeople() {
		return people;
	}
	public String toString() {
		final int maxLen = 3;
		return "MyLibrary " + name + ": books="
				+ (books != null ? books.subList(0, Math.min(books.size(), maxLen)) : null) + ", people="
				+ (people != null ? people.subList(0, Math.min(people.size(), maxLen)) : null);
	}

	public void addBook(Book book) {
		this.books.add(book);
	}

	public void addPerson(Person person) {
		this.people.add(person);
	}
	public int printBooks() {
		int cpt = 0;

		for (Book book : books) {
			System.out.println(book.getTitle() + " - " + book.getAuthor());
			cpt++;
		}

		return cpt;
	}
	public int printMembers() {
		int cpt = 0;

		Iterator<Person> itp = this.getPeople().iterator();
		while(itp.hasNext()) {
			Person p = itp.next();
			System.out.println(++cpt + ": " + p.getName());
		}
		return cpt;
	}
	
}
	
	
	
	

