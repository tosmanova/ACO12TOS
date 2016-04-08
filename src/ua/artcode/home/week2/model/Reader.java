package ua.artcode.home.week2.model;

import java.util.Arrays;

/**
 * Created by tos on 4/7/16.
 */
public class Reader extends Person {
    private int readerId;
    private Book[] books = new Book[0];
    private boolean isInBlackList;

    public Reader(Person person, int readerId) {
        super(person.getFirstName(), person.getLastName());
        this.readerId = readerId;
    }

    public boolean isInBlackList() {
        return isInBlackList;
    }

    public void setInBlackList(boolean inBlackList) {
        isInBlackList = inBlackList;
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "person=" + super.toString() +
                ", readerId=" + readerId +
                ", books=" + Arrays.toString(books) +
                '}';
    }

    public void addBook(Book book){
        Book[] newBooks = new Book[books.length +1];
        System.arraycopy(books,0,newBooks,0,books.length);
        newBooks[newBooks.length-1] = book;

        System.out.println("Book [" + book + "] added." );
    }
}
