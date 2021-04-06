package be.icc.poo;

import java.time.LocalDate;

public class Book {
	
	private String title;
	private String author;
	private int totalPages;
	private Person person;
	private int loanPeriod;
	private double rentalPrice;
	private LocalDate borrowingDate;
	private String language;
	private BookTypeEnum bookType; 
	
	
	
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTitle() {

		return title;

	}

	public void setTitle(String title) {

		this.title = title;

	}

	public String getAuthor() {

		return author;

	}

	public void setAuthor(String author) {

		this.author = author;

	}

	public int getTotalPages() {

		return totalPages;

	}

	public void setTotalPages(int totalPages) {

		this.totalPages = totalPages;

	}

	public Person getPerson() {

		return person;

	}

	public void setPerson(Person person) {

		this.person = person;

	}

	public int getLoanPeriod() {

		return loanPeriod;

	}

	public void setLoanPeriod(int loanPeriod) {

		this.loanPeriod = loanPeriod;

	}

	public double getRentalPrice() {

		return rentalPrice;

	}

	public void setRentalPrice(double rentalPrice) {

		this.rentalPrice = rentalPrice;

	}

	public LocalDate getBorrowingDate() {

		return borrowingDate;

	}

	public void setBorrowingDate(LocalDate borrowingDate) {

		this.borrowingDate = borrowingDate;

	}

	public void setBorrower(Person locataire) {

		this.person = locataire;

	}
	
	public Book(String title, String author, int totalPages, String language, BookTypeEnum booktype) {

		super();

		this.title = title;

		this.author = author;

		this.totalPages = totalPages;

		this.language = language;

		this.rentalPrice = 2.9; //TODO : est-ce la bonne methode?
		
		this.bookType = booktype;


		}



		public BookTypeEnum getBookType() {

		return bookType;

		}



		public void setBookType(BookTypeEnum bookType) {

		this.bookType = bookType;

		}



		public boolean isElectronicalBook() {

		return this.bookType.equals(BookTypeEnum.ELECTRONICAL_BOOK);

		}



		public boolean isGraphicalRoman() {

		return this.bookType.equals(BookTypeEnum.GRAPHICAL_ROMAN);

		}


}
