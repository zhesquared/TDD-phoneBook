import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;


public class PhoneBookTest {

    private static final PhoneBook phoneBook = new PhoneBook();

    @BeforeAll
    public static void startTesting() {
        System.out.println("Start testing class phoneBook");
    }

    @AfterAll
    public static void finishedTesting() {
        System.out.println("Testing class phoneBook is complete");
    }

    @Test
    public void testAddContact() {
        phoneBook.add("A", "1");
        int result = phoneBook.add("B", "2");
        int expected = 2;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByNumber() {
        phoneBook.add("A", "1");
        phoneBook.add("B", "2");
        String result = phoneBook.findByNumber("2");
        String expected = "B";

        assertThat(result, Matchers.containsString(expected));
    }

    @Test
    public void testFindByName() {
        phoneBook.add("A", "1");
        phoneBook.add("B", "2");
        String result = phoneBook.findByName("B");
        String expected = "2";

        assertThat(result, Matchers.containsString(expected));
    }

    @Test
    public void testPrintAllNames() {
        phoneBook.add("D", "4");
        phoneBook.add("C", "3");
        phoneBook.add("A", "1");
        phoneBook.add("B", "2");

        Set<String> result = phoneBook.printAllNames();
        String[] expected = {"A", "B", "C", "D"};

        assertThat(result.toArray(), Matchers.equalTo(expected));
    }
}
