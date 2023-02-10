import java.util.HashMap;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */

public class hwork_1 {

    /**HashMap для хранения телефонной книги*/
    private static final HashMap<String, String> contacts = new HashMap<>();

    /**Функция добавления нового контакта в телефонную книгу*/
    public static void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    /**Функция добавления нового номера в контакт*/
    public static void addPhoneNumberToExistingContact(String name, String phoneNumber) {
        contacts.put(name, contacts.get(name) + " " + phoneNumber);
    }

    /**Функция удаления номера из контакта*/
    public static void removePhoneNumberFromExistingContact(String name, String phoneNumber) {
        String contactDetails = contacts.get(name);
        String newContactDetails = contactDetails.replace(phoneNumber, "");
        contacts.put(name, newContactDetails);
    }

    /**Функция удаления контакта из телефонной книги*/
    public static void removeContact(String name) {
        contacts.remove(name);
    }

    /**Функция вывода телефонной книги*/
    public static void printContacts() {
        for (String name : contacts.keySet()) {
            System.out.println("Name: " + name + "; Phone Numbers: " + contacts.get(name));
        }
    }

    public static void main(String[] args) {
        addContact("Михаил", "+7 812 111 11 11");
        addContact("Анна", "+7 812 222 22 22");
        addContact("Пётр", "+7 812 333 33 33");

        printContacts();

        addPhoneNumberToExistingContact("Михаил", "+7 812 111 11 13");
        addPhoneNumberToExistingContact("Анна", "+7 812 222 22 23");

        printContacts();

        removePhoneNumberFromExistingContact("Михаил", "+7 812 111 11 11");
        removeContact("Пётр");

        printContacts();
    }
}
