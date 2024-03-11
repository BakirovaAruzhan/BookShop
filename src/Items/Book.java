package Items;

import java.util.*;

import static Items.LibraryItem.books;

public class Book extends LibraryItem implements BorrowableItem {

    private String author;
    private String tile;
    private String isbn;

    public Book(int id, String name, boolean isAvailable, String author, String tile, String isbn) {
        super(id, name, isAvailable);
        this.author = author;
        this.tile = tile;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void displayDetails() {
        for (Book book : books) {
            book.displayDetails();
        }

    }

    @Override
    public String toString() {
        return "Book{" +"№"+ getId()+" :"+
                "author='" + author + '\'' +
                ", tile='" + tile + '\'' +
                ", isbn='" + isbn + '\'' +
                "} " + super.toString();
    }

    @Override
    public void borrowItem() {

    }

    @Override
    public void returnItem() {

    }

}





