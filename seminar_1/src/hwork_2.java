/**
 * Задание 2.
 * Вывести все простые числа от 1 до 1000
 */
public class hwork_2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; ++i) {
            Integer num = 1;
            for (int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    num = null;
                    break;
                }
            }
            if (num != null) System.out.println(i);
        }
    }
}
// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
