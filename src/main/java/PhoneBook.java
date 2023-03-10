import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, String> contacts = new TreeMap<>();

    public int add(String name, String number) {
        contacts.put(name, number);
        return contacts.size();
    }

    public String findByNumber(String number) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String findByName(String name) {
        return contacts.get(name);
    }

    public Set<String> printAllNames() {
        System.out.println(contacts.keySet());
        return contacts.keySet();
    }
}