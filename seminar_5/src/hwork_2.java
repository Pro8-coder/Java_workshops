import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedHashMap;

/**
 * Пусть дан список сотрудников:
 * Светлана Петрова
 * Кристина Белова
 * Анна Мусина
 * Анна Крутова
 * Иван Юрин
 * Петр Лыков
 * Павел Чернов
 * Петр Чернышов
 * Мария Федорова
 * Марина Светлова
 * Иван Савин
 * Мария Рыкова
 * Марина Лугова
 * Анна Владимирова
 * Иван Мечников
 * Петр Петин
 * Иван Ежов
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 * Иван 4, ...
 */

public class hwork_2 {
    public static void main(String[] args) {

        String employeeLst = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин," +
                " Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина," +
                " Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";

        String[] employeeArray = employeeLst.split(", ");

        HashMap<String, Integer> names = new HashMap<>();

        for (String name : employeeArray) {
            String[] FullName = name.split(" ");
            if (names.containsKey(FullName[0])) {
                names.put(FullName[0], names.get(FullName[0]) + 1);
            } else {
                names.put(FullName[0], 1);
            }
        }

        List<Integer> positions = new ArrayList<>(names.values());
        positions.sort(Collections.reverseOrder());

        HashMap<String, Integer> sortedNames = new LinkedHashMap<>();
        for (int position : positions) {
            for (String name : names.keySet()) {
                if (position == names.get(name)) {
                    sortedNames.put(name, position);
                }
            }
        }
        System.out.println(sortedNames);
    }
}
