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
	
	
}
