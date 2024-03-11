package Items;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public abstract class LibraryItem {

    private int id;
    private String name;
    private boolean isAvailable;

    public void displayDetails() {
        System.out.printf("ID:%d, Name: %s, isAvailable: %s\n", id, name, isAvailable);
    }


    public LibraryItem(int id, String name, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public static ArrayList<Book> books = new ArrayList<>();
    public static ArrayList<DVD> dvds = new ArrayList<>();
    public static ArrayList<Magazine> magazines = new ArrayList<>();


    public static void initData() {




    }


}




