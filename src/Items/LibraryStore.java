package Items;


import java.io.Serializable;

public class LibraryStore implements Serializable {

    private static final long serialVersionUID = 1234L;

    private int idx = 0;
    private final LibraryItem[] libraryItems;

    public LibraryStore(int size) {
        libraryItems = new LibraryItem[size];
    }


    public boolean add(LibraryItem item) {
        if (idx == libraryItems.length) {
            return false;
        }
        libraryItems[idx++] = item;
        return true;
    }

    public LibraryItem[] query(String type) {
        return switch (type) {
            case "all" -> baseQuery(LibraryItem.class);
            case "paper" -> baseQuery(PaperItem.class);
            case "dvd" -> baseQuery(DVD.class);
            case "book" -> baseQuery(Book.class);
            case "magazine" -> baseQuery(Magazine.class);
            default -> new LibraryItem[0];
        };
    }

    private <T> LibraryItem[] baseQuery(Class<T> type) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            LibraryItem item = libraryItems[i];
            if (type.isInstance(item)) {
                count++;
            }
        }

        LibraryItem[] items = new LibraryItem[count];
        int j = 0;
        for (int i = 0; i < idx; i++) {
            LibraryItem item = libraryItems[i];
            if (type.isInstance(item)) {
                items[j++] = item;
            }
        }

        return items;
    }
}