import java.util.LinkedList;
import java.util.Random;

/**
 * Создать очередь с помощью LinkedList и реализовать следующие методы:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 * Вызвать полученные методы и убедиться в их работоспособности.
 */

public class hwork_2 {
    public static void main(String[] args) {
        hwork_2 elem_queue = new hwork_2();
        Random rand = new Random();
        for (int i = 0; i < 10; ++i) elem_queue.enqueue(rand.nextInt(20));
        System.out.println(elem_queue.get_elem());
        System.out.println(elem_queue.dequeue());
        System.out.println(elem_queue.dequeue());
        System.out.println(elem_queue.get_elem());
        System.out.println(elem_queue.first());
        System.out.println(elem_queue.get_elem());
    }

    private final LinkedList<Object> elem = new LinkedList<>();

    public void enqueue(Object el) {
        elem.add(el);
    }

    public Object dequeue() {
        Object first = elem.getFirst();
        elem.removeFirst();
        return first;
    }

    public Object first() {
        return elem.getFirst();
    }

    public LinkedList<Object> get_elem() {
        return elem;
    }
}
