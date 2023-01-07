import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();

    public int add(String name, String number) {
        contacts.put(name, number);
        return contacts.size();
    }

}
//add - добавить имя с номером. Метод должен возвращать количество контактов после добавления, при этом гарантируется, что не будут добавляться повторяющиеся имена;
//findByNumber - найти имя по номеру без полного перебора;
//findByName - найти номер по имени без полного перебора;
//printAllNames - вывести все имена в алфавитном порядке без необходимости проводить сортировку.
