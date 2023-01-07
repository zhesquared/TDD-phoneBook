import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class PhoneBookTest {

    private static PhoneBook phoneBook = new PhoneBook();

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
        int result = phoneBook.add("A", "1");
        int expected = 1;
        Assertions.assertEquals(expected, result);
    }
}
