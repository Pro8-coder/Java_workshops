/**
 * Создать список целых чисел (заполнить случайными числами).
 * Найти минимальное, максимальное и среднее из этого списка.
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class hwork_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; ++i) list.add(random.nextInt());
        System.out.println(list);
        int min_lst = Collections.min(list);
        int max_lst = Collections.max(list);
        double avg_lst = 0;
        for (int i : list) avg_lst += i;
        avg_lst /= list.size();
        System.out.println(min_lst);
        System.out.println(max_lst);
        System.out.println(avg_lst);
    }
}
