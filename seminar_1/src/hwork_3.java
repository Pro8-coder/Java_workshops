/**
 * Задание 3.
 * Реализовать простой калькулятор (операции + - / * )
 * Пример работы программы:
 * Введите число 1: 2
 * Введите число 2: 3
 * Введите операцию: +
 * Ответ: 5
 * Введите число 1: 2
 * Введите число 2: 3
 * Введите операцию: а
 * Ответ: Такой операции нет
 */

import java.util.Scanner;

public class hwork_3 {
    public static void main(String[] args) {
        try {
            int result;
            System.out.print("Введите число 1: ");
            int num1 = new Scanner(System.in).nextInt();
            System.out.print("Введите число 2: ");
            int num2 = new Scanner(System.in).nextInt();
            System.out.print("Введите операцию: ");
            String operation = new Scanner(System.in).nextLine();
            switch (operation) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
                default -> {
                    System.out.println("Такой операции нет.");
                    result = 0;
                }
            }
            System.out.printf("Ответ: %d", result);
        }
        catch (Exception e) {
            System.out.print("Неверно введено число.");
        }
    }
}
