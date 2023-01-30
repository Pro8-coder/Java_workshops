/**
 * Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные приведены ниже в виде json строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Входная строка:
 * {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * Выходная строка:
 * select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow"
 */

import java.util.Objects;

public class hwork_1 {
    public static final String SQL = "select * from students where ";
    public static final String IN_STR = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";

    public static void main(String[] args) {
        String str = IN_STR.replace("{", "").replace("}", "").replace(" ", "");
        String[] new_str = str.split(",");
        StringBuilder str_bui = new StringBuilder(SQL);
        for (int i = 0; i < new_str.length; ++i) {
            String[] elem = new_str[i].split(":");
            if (!Objects.equals(elem[1], "\"null\"")) {
                str_bui.append(elem[0].replace("\"", "")).append(" = ").append(elem[1]);
                if (i < new_str.length - 2) {
                    str_bui.append(" and ");
                }
            }
        }
        System.out.print(str_bui);
    }
}
