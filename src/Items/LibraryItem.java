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

    public static ArrayList<Book> books= new ArrayList<>();
    public static ArrayList<DVD> dvds=new ArrayList<>();
    public static ArrayList<Magazine> magazines=new ArrayList<>();


    public static void initData() {


        books.add(new Book("Меган Нолан", "«Акты отчаяния»", "MNAO54620"));
        books.add(new Book("Илья Мамаев-Найлз", "«Год порно»", "IMNGP7"));
        books.add(new Book("Сборник", "«Зоопарк в твоей голове»", "CZBTG4"));
        books.add(new Book("Кай Берд, Мартин Дж. Шервин", "«Оппенгеймер. Триумф и трагедия Американского Прометея»", "KBMDO154"));
        books.add(new Book("Джули Оцука", "«Пловцы»", "DOP41"));
        books.add(new Book("Андрей Подшибякин", "«Последний день лета»", "APPDL7"));
        books.add(new Book("М. Л. Рио", "«Словно мы злодеи»", "LMZ78"));
        books.add(new Book("Лю Цысинь", "«Удержать небо»", "UN123"));
        books.add(new Book("Мишель Уэльбек", "«Уничтожить»", "MUU52"));


        dvds.add(new DVD("Зеленая миля", 189, "США • драма  Режиссёр: Фрэнк Дарабонт'"));
        dvds.add(new DVD("1+1", 112, "Франция • драма  Режиссёр: Оливье Накаш"));
        dvds.add(new DVD("Побег из Шоушенка", 142, "США • драма  Режиссёр: Фрэнк Дарабонт"));
        dvds.add(new DVD("Форрест Гамп", 142, "США • драма  Режиссёр: Роберт Земекис"));
        dvds.add(new DVD("Интерстеллар", 169, "США • фантастика  Режиссёр: Кристофер Нолан"));
        dvds.add(new DVD("Властелин колец: Возвращение короля", 201, "Новая Зеландия • фэнтези  Режиссёр: Питер Джексон"));


        magazines.add(new Magazine("ADAC Motorwelt", 1945, "Издается сообществом автолюбителей Германии — Allgemeiner Deutscher Automobil-Club (ADAC)"));
        magazines.add(new Magazine("Reader's Digest", 1922, "Издается раз в месяц компанией Reader's Digest Association"));
        magazines.add(new Magazine("Cosmopolitan", 1886, "Начал издаваться в США в 1886 году в качестве семейного журнала."));
        magazines.add(new Magazine("National Geographic", 1888, "Публикуется с октября 1888 года Национальным географическим обществом США."));
        magazines.add(new Magazine("Good Housekeeping", 1885, "Издается Hearst Corporation в 15 странах мира"));
        magazines.add(new Magazine("Gushi Hui (\"Истории\")", 1963, "Издается шанхайской Shanghai Literature & Arts Publishing."));
        magazines.add(new Magazine("Glamour", 1939, "Издается группой Conde Nast, которая также выпускает Vogue, GQ, Vanity Fair — всего 130 журналов в 23 странах общим тиражом 34 млн экземпляров."));
        magazines.add(new Magazine("Duzhe (\"Читатель\")", 1981, "Выпускается с 1981 года на упрощенной версии китайского языка и распространяется в 90 странах мира."));
        magazines.add(new Magazine("People", 1974, "Издается с 1974 года. Среди героев первого номера, в частности, был Александр Солженицын."));


    }


}




