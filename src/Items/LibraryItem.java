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

    public static ArrayList<Book> books = new ArrayList<>();
    public static ArrayList<DVD> dvds = new ArrayList<>();
    public static ArrayList<Magazine> magazines = new ArrayList<>();

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static ArrayList<DVD> getDVDs() {
        return dvds;
    }

    public static ArrayList<Magazine> getMagazines() {
        return magazines;
    }


    public static ArrayList<LibraryItem> getItems() {
        ArrayList<LibraryItem> items = new ArrayList<>();
        items.addAll(books);
        items.addAll(dvds);
        items.addAll(magazines);
        return items;
    }

    public void borrowItem(int itemId, String userLogin) {
        ArrayList<LibraryItem> items = getItems();

        if (itemId >= 0 && itemId < items.size()) {
            LibraryItem item = items.get(itemId);
            if (item.isAvailable()) {
                item.setAvailable(false);
                System.out.println("Элемент взят в аренду пользователем " + userLogin + ": " + item.getName());
            } else {
                System.out.println("Элемент недоступен для аренды.");
            }
        } else {
            System.out.println("Некорректный номер элемента.");
        }
    }


    public void returnItem(int itemId, String userLogin) {
        ArrayList<LibraryItem> items = getItems();

        if (itemId >= 0 && itemId < items.size()) {
            LibraryItem item = items.get(itemId);
            if (!item.isAvailable()) {
                item.setAvailable(true);
                System.out.println("Элемент возвращен пользователем " + userLogin + ": " + item.getName());
            } else {
                System.out.println("Элемент уже доступен.");
            }
        } else {
            System.out.println("Некорректный номер элемента.");
        }
    }

    public static void initData() {

    }
}




