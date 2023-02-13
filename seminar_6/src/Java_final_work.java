import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Создать класс Ноутбук для магазина техники.
 * Добавить атрибуты класса с соответствующими типами.
 * Например,
 * - идентификатор
 * - производитель
 * - название модели
 * - RAM
 * - объем HD
 * - операционная система
 * - цена
 * - и т.д.
 * Добавить конструктор класса.
 * Добавить необходимые методы класса.
 * Создать множество ноутбуков (множество объектов класса ноутбук).
 * 3-10 штук
 * Вывести в консоль меню пользователя:
 * Добро пожаловать в каталог ноутбуков!
 * Выберите действие:
 *   1 - Печать всех товаров
 *   2 - Поиск по каталогу
 *   0 - Выход
 * Написать метод, который будет запрашивать у пользователя критерий фильтрации (один) и выведет ноутбуки,
 * отвечающие критерию.
 */

public class Java_final_work {
    public static class Notebook {
        // Атрибуты класса с соответствующими типами
        int id; String manufacturer; String model; int RAM; int HDD; String OS; String color; int price;

        // Конструктор класса
        public Notebook(int id, String manufacturer, String model, int RAM, int HDD, String OS, String color, int price) {
            this.id = id;
            this.manufacturer = manufacturer;
            this.model = model;
            this.RAM = RAM;
            this.HDD = HDD;
            this.OS = OS;
            this.color = color;
            this.price = price;
        }

        // Необходимые методы класса
        public int getId() {return id;}
        public String getManufacturer() {return manufacturer;}
        public String getModel() {return model;}
        public int getRAM() {return RAM;}
        public int getHDD() {return HDD;}
        public String getOS() {return OS;}
        public String getColor() {return color;}
        public int getPrice() {return price;}

        // Проверка кода
        public static void main(String[] args) {
            List<Notebook> notebooks = new ArrayList<>();
            Notebook notebook1 = new Notebook(1, "HP", "Envy 15", 16, 256,
                    "Windows 10", "Серебристый", 60000);
            Notebook notebook2 = new Notebook(2, "Lenovo", "ThinkPad X1", 8, 512,
                    "Windows 10", "Чёрный", 54000);
            Notebook notebook3 = new Notebook(3, "Dell", "Inspiron 15", 8, 256,
                    "Windows 10", "Белый", 48000);
            Notebook notebook4 = new Notebook(4, "Apple", "MacBook Pro", 16, 512,
                    "Mac OS X", "Серебристый", 90000);
            Notebook notebook5 = new Notebook(5, "Acer", "Aspire 5", 8, 256,
                    "Windows 10", "Серебристый", 36000);

            notebooks.add(notebook1);
            notebooks.add(notebook2);
            notebooks.add(notebook3);
            notebooks.add(notebook4);
            notebooks.add(notebook5);

            System.out.println("Добро пожаловать в каталог ноутбуков!");
            System.out.println("Выберите действие:");
            System.out.println("1 - Печать всех товаров \n2 - Поиск по каталогу \n0 - Выход");

            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input == 1) {
                printNotebooks(notebooks);
            } else if (input == 2) {
                searchNotebooks(notebooks);
            } else if (input == 0) {
                System.out.println("Приходите снова!");
            }
        }

        private static void printNotebooks(List<Notebook> notebooks) {
            for (Notebook n : notebooks) {
                System.out.println("id товара: " + n.id + ", " + "Производитель: " + n.manufacturer + ", " + "Модель: " +
                        n.model + ", " + "RAM: " + n.RAM + ", " + " HDD: " + n.HDD + ", " + "ОС: " + n.OS + ", " +
                        "Цвет: " + n.color + ", " + "Цена: " + n.price);
            }
        }

        // Метод для поиска ноутбуков
        public static void searchNotebooks(List<Notebook> notebooks) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите критерии поиска: ");
            System.out.println("Мин. объем ОЗУ: ");
            int criteriaRAM = scanner.nextInt();
            System.out.println("Мин. объем HDD: ");
            int criteriaHDD = scanner.nextInt();
            System.out.println("Цвет: ");
            String criteriaColor = scanner.next();
            System.out.println("Макс. цена: ");
            int criteriaPrice = scanner.nextInt();

            for (Notebook n : notebooks) {
                if (n.getRAM() >= criteriaRAM && n.getHDD() >= criteriaHDD &&
                        n.getColor().equals(criteriaColor) && n.getPrice() <= criteriaPrice) {
                    System.out.println("Найден ноутбук: " + "id товара: " + n.id + ", " + "Производитель: " +
                            n.manufacturer + ", " + "Модель: " + n.model + ", " + "RAM: " + n.RAM + ", " + " HDD: " +
                            n.HDD + ", " + "ОС: " + n.OS + ", " + "Цвет: " + n.color + ", " + "Цена: " + n.price);
                }
            }
        }
    }
}
