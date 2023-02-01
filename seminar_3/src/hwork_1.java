/**
 * Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа.
 */

import java.util.ArrayList;
import java.util.Random;

public class hwork_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; ++i) list.add(random.nextInt());
        System.out.println(list);
        int j = 0;
        while (j < list.size()) {
            if (list.get(j) % 2 == 0) list.remove(j);
            else ++j;
        }
        System.out.print(list);
    }
}
