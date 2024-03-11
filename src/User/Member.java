package User;


import Items.Book;
import Items.BorrowableItem;

import java.util.List;
import java.util.Scanner;

import static Items.LibraryItem.books;


public class Member extends User{
    private List<BorrowableItem> borrowedItems;

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






    public String toString() {
        return "Member{" +
                "active=" + isActive() +
                ", id=" + getId() +
                ", login='" + getLogin() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", role='" + getRole() + '\'' +
                '}';
    }

    public boolean isActive() {
       return true;
    }

}
