package ua.artcode.home.week2.model;

/**
 * Created by tos on 4/7/16.
 */
public class Library {

    private final String name;
    private Book[] availableBooks =  new Book[0];
    private Reader[] allReaders = new Reader[0];
    private int lastReaderId = 0;

    public Library(String name) {
        this.name = name;
    }

    public Reader[] getAllReaders() {
        return allReaders;
    }

    public void setAllReaders(Reader[] allReaders) {
        this.allReaders = allReaders;
    }

    public Book[] getAvailableBooks() {
        return availableBooks;
    }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    public Reader registerReader(Person p1) {
        Reader reader = new Reader(p1, ++lastReaderId);
        Reader[] newReaders = new Reader[this.allReaders.length + 1];
        for (int i = 0; i < allReaders.length; i++) {
            newReaders[i] = allReaders[i];
        }
        newReaders[newReaders.length-1] = reader;
        System.out.println("Reader [" + reader + "] added." );

        return reader;
    }

    public void addBook(Book book) {
        Book[] newBooks = new Book[this.availableBooks.length +1];
        System.arraycopy(availableBooks,0,newBooks,0,availableBooks.length);
        newBooks[newBooks.length-1] = book;

        System.out.println("Book [" + book + "] added." );
    }

    public boolean borrowBook(Book book1, Reader r1) {

        for (int i = 0; i < availableBooks.length ; i++) {
            if (availableBooks[i].equals(book1)){

            }
        }
        return true;
    }
}
