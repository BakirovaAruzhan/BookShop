package User;


import Items.Book;
import Items.BorrowableItem;

import java.util.List;
import java.util.Scanner;

import static Items.LibraryItem.books;


public class Member extends User{
    private List<BorrowableItem> borrowedItems;
    private boolean isActive;

    public Member(int id, String login, String password, String role) {
        super(id, login, password, role);
    }


    public void checkAccountStatus(){

    }


    public static Book getBookById(String id) {


        Book current = null;

        for (Book book : books) {
            if (book.getIsbn() == id) {
                current = book;
                break;
            }
        }

        return current;
    }


    public void borrowItem(BorrowableItem item) {
        if (!item.isBorrowed()) {
            item.setBorrowed(true);
            borrowedItems.add(item);
            System.out.println(getLogin() + " взято вами в аренду.");
        } else {
            System.out.println(item.getName() + " уже взято в аренду.");
        }
    }



   






}
