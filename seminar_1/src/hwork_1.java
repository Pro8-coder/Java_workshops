/**
 * Задание 1.
 * Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n
 */

import java.util.Scanner;

public class hwork_1 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите целое число 'n': ");
            try {
                int num = new Scanner(System.in).nextInt();
                int result_sum = 1;
                for (int i = 2; i <= num; ++i) result_sum += i;
                int result_factor = 1;
                for (int i = 2; i <= num; ++i) result_factor *= i;
                System.out.printf("Сумма чисел от 1 до %d = %d", num, result_sum);
                System.out.printf("\nФакториал чисел от 1 до %d = %d", num, result_factor);
                break;
            } catch (Exception e) {
                System.out.print("Неверный ввод\n");
            }
        }
    }
}
