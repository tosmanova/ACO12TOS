package ua.artcode.home.week2.test;

import ua.artcode.home.week2.model.Book;
import ua.artcode.home.week2.model.Library;
import ua.artcode.home.week2.model.Person;
import ua.artcode.home.week2.model.Reader;

/**
 * Created by tos on 4/7/16.
 */
public class LibraryTest {
    public static void main(String[] args) {
        Person p1 = new Person("Karas", "Ivan");
        Person p2 = new Person("Tester", "Sanyok");

        Library library = new Library("Chitalnya",3);
        Reader r1 = library.registerReader(p1);
        Reader r2 = library.registerReader(p2);

        Book book1 = new Book("EO",1879,"Pushkin");

        library.addBook(book1);
        library.addBook(new Book("T2",1979,"Test"));

        //show all available books
        System.out.println(library.showAvailableBooks());
        library.borrowBook(book1,r1);


    }

    public void showBooksByAuthorTest(Library library, String author){

        library.showBooksByAuthor();

    }
}
