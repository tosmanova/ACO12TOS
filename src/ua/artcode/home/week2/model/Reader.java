package ua.artcode.home.week2.model;

import java.util.Arrays;

/**
 * Created by tos on 4/7/16.
 */
public class Reader extends Person {
    private int readerId;
    private Book[] books;
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
}
