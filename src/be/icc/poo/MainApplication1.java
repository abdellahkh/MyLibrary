package be.icc.poo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainApplication1 {
    private static Scanner scanner = new Scanner(System.in);
    private static MyLibrary myLibrary = new MyLibrary("Store");

    public static void main(String[] args) {
System.out.println("=====Bienvenu dans notre librairie=====");
		
		showInitialOptions();		//Affichage du menu principale
		
	    String selectedOption = scanner.nextLine();  // Enregistre l'entrée utilisateur
	    
	    while (!selectedOption.equals("0")) {

			switch (selectedOption) {
				case "1":
					addMemberMenu();   
					break;

				case "2":
					addBookMenu();
					break;

				case "3":
					rentBook();
					break;

				case "4":
					String selectedSubOption = showStatisticMenuAndGetSelection();
					showSelectedStats(selectedSubOption);
					break;

				default:
					System.out.println("L'option demandé n'existe pas, veuillez reintroduire une option valable");
					break;

			}
			showInitialOptions();
			selectedOption = scanner.nextLine();

	    }
	}
	
	private static void showInitialOptions() {
		System.out.println("|   \nFaite un choix:                 |");
		System.out.println("|        1. Ajouter un membre         |");
		System.out.println("|        2. Ajouter un livre          |");
		System.out.println("|        3. Emprunter un livre        |");
		System.out.println("|        4. Affichez les statistiques |");
		System.out.println("|        0. Quitter                   |");

		System.out.println("Select option:");
	}
	
	private static void addMemberMenu() {
		// TODO
		System.out.println("Ajout d'un nouveau membre");
	}
	
	private static void addBookMenu() {
		// TODO
		System.out.println("Option 2 ajout du livre ");
	}
	
	private static void rentBook() {
		// TODO
		System.out.println("louer un livre");
	}
	
	private static String showStatisticMenuAndGetSelection() {
		
		//Affichage du menu pour les stats et renvoyer le choix
		
		List<String> possibleOptions = Arrays.asList("a", "b", "c", "d", "e");  // Les valeurs de choix possibles

		System.out.println(" a. nombre total de livres et de membres,"
        			  + "\n b. nombre de livres électroniques et de romans graphiques,"
        			  + "\n c. nombres de membres qui ont un livre en emprunt,"
        		      + "\n d. nombre de livres empruntés,"
        			  + "\n e. nombre de livres en retard.");

		String selectedOption = scanner.nextLine().toLowerCase();
		while (!possibleOptions.contains(selectedOption)){
			System.out.println("veuillez faire un choix parmis les propositions suivante");

			selectedOption = scanner.nextLine();
		}

		return selectedOption;
	}
	
	// afficher les statistiques sélectionnées
		private static void showSelectedStats(String selectedOption) {
			
			// On recupere les infos concernant notre librairie
			List<Person> people = myLibrary.getPeople();
			List<Book> books = myLibrary.getBooks();

			switch (selectedOption) {
				case "a":
					showNumberOfPeopleAndBooks(people, books);
					break;
				case "b":
					showElectronicBooksNumberAndGraphicsRoman(books);
					break;
				case "c":
					showNumberOfMemberThatHaveABookBorrowed(people);
					break;
				case "d":
					showCountBooksBorrowed(books);
					break;
				case "e":
					System.out.println("Selected nombres de membres qui ont un livre en emprunt,");
					break;
				default:
					System.out.println("Invalid selection");
					break; // Est-ce necessaire??


			}
		}
		
		//Statistique de nombre de personne et de livre
		private static void showNumberOfPeopleAndBooks(List<Person> people, List<Book> books) {

			if(people == null || books == null){
				System.out.println("Books or People list doesn't exists");
			}

			System.out.println("Total membres = " + books.size());
			System.out.println("Total livres = " + people.size());
		}
		
		private static void showElectronicBooksNumberAndGraphicsRoman(List<Book> books) {
			int totalElectronicalBook = 0;
			int totalGraphicalRoman = 0;

			for (Book book : books) {
				if(book.isElectronicalBook()){
					totalElectronicalBook ++;
				}
				if(book.isGraphicalRoman()){
					totalGraphicalRoman ++;
				}
			}

			System.out.println("Il y a " + totalElectronicalBook + " livre(s) electroniques et " + totalGraphicalRoman + " roman(s) graphiques");
		}
		
		//afficher les membres qui ont emprunté un livre
		private static void showNumberOfMemberThatHaveABookBorrowed(List<Person> people) {
			int numberOfPeopleThatHaveABook = 0;

			for (Person person : people) {
				if(person.getBooks().size() > 0){
					numberOfPeopleThatHaveABook ++;
				}
			}

			System.out.println("Il y a " + numberOfPeopleThatHaveABook + " personne(s) qui ont un livre emprunté");
		}
		
		
		// Affiche les livres en cours d'emprunts
		private static void showCountBooksBorrowed(List<Book> books) {
			int numberBorrowedBooks = 0;
			
			for (Book book : books) {
				if(book.getPerson() != null) {
					numberBorrowedBooks ++;
				}
			}
			System.out.println("Il y a " + numberBorrowedBooks + " livres en cours d'emprunt");
		}

    }
	
