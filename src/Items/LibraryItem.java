package Items;

import java.util.ArrayList;

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

    @Override
    public String toString() {
        return "LibraryItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public static ArrayList<Book> books = new ArrayList<>();
    public static ArrayList<DVD> dvds = new ArrayList<>();
    public static ArrayList<Magazine> magazines = new ArrayList<>();

    public void getBooks() {
        System.out.println("Список книг:");
        int numb = 0;

        for (int i = 0; i < books.size(); i++) {
            System.out.println(numb + 1 + ". " + books.get(i));
            numb++;
        }


    }

    public void getDVDs() {
        System.out.println("Список дисков: ");
        int numb = 0;

        for (int i = 0; i < dvds.size(); i++) {
            System.out.println(numb + 1 + ". " + dvds.get(i));
            numb++;
        }



    }

    public void getMagazines() {
        System.out.println("Список дисков: ");
        int numb = 0;

        for (int i = 0; i < magazines.size(); i++) {
            System.out.println(numb + 1 + ". " + magazines.get(i));
            numb++;
        }

    }


    public void getItems() {
        ArrayList<LibraryItem> items = new ArrayList<>();
        items.addAll(books);
        items.addAll(dvds);
        items.addAll(magazines);
    }


    public static void initData() {

    }
}
