package Items;

import java.util.*;

import static Items.LibraryItem.books;

public class Book implements BorrowableItem, PaperItem {

    private String author;
    private String tile;
    private String isbn;

    public Book(String author, String tile, String isbn) {
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

    public void borrowItem() {
        boolean isBorrowed;
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println((getIsbn()) + " взято в пользование.");
        } else {
            System.out.println(getIsbn() + " уже взято в пользование.");
        }
    }

    @Override
    public void returnItem() {
        if (!isBorrowed) {
            isBorrowed = false;
            System.out.println(getName() + " возвращено.");
        } else {
            System.out.println(getName() + " не было взято в пользование.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return true;
    }

    public void displayDetails() {
        for (Book book : books) {
            book.displayDetails();
        }

    }
}



