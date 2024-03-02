import java.awt.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Вы пользователь или сотрудник?");
            System.out.println("1. Пользователь");
            System.out.println("2. Сотрудник");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Вы выбрали пользователя");

                System.out.println("1. Список элементов");
                System.out.println("2. Занять предмет");
                System.out.println("3. Поиск предметов по типу");
                System.out.println("4. Список одолженных предметов");
                System.out.println("5. Получить информацию о профиле");
                System.out.println("6. Вернуть предмет");
                System.out.println("7. Выход из системы");
                int userOption = scanner.nextInt();

                switch (userOption) {
                    case 1:
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("");
                        break;
                    case 6:
                        System.out.println("");
                        break;
                    case 7:
                        System.out.println("");
                        break;

                }
            } else if (choice == 2) {
                System.out.println("Вы выбрали сотрудника");

                // Дополнительный выбор внутри сотрудника

                System.out.println("1. Список элементов");
                System.out.println("2. Занять предмет");
                System.out.println("3. Поиск предметов по типу");
                System.out.println("4. Список одолженных предметов");
                System.out.println("5. Получить информацию о профиле");
                System.out.println("6. Вернуть предмет");
                System.out.println("7. Выход из системы");
                int employeeAction = scanner.nextInt();

                switch (employeeAction) {
                    case 1:
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("");
                        break;
                    case 6:
                        System.out.println("");
                        break;
                    case 7:
                        System.out.println("");
                        break;
                }
            } else {

                System.out.println("Попробуйте еще раз)");
            }
        }


    }

}







