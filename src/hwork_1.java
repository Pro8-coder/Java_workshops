import java.util.LinkedList;
import java.util.Random;

/**
 * Создать LinkedList целых чисел (заполнить случайными числами).
 * Реализуйте метод, который вернет “перевернутый” список.
 */

public class hwork_1 {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; ++i) {
            lst.add(rand.nextInt());
        }
        System.out.println(lst);
        System.out.println(reversed_lst(lst));
    }

    private static LinkedList<Integer> reversed_lst(LinkedList<Integer> lst) {
        for (int i = 1; i < lst.size(); ++i) lst.addFirst(lst.remove(i));
        return lst;
    }
}