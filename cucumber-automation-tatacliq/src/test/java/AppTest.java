import org.junit.jupiter.api.Test;

import com.example.App;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AppTest {

    @Test
    public void testMainMethod() {
        // Assuming App has a method that returns a string
        String expected = "Hello, World!";
        String actual = App.getGreeting(); // Replace with actual method to test
        assertEquals(expected, actual);
    }

    @Test
    public void testMainMethod2() {
        // Assuming App has a method that returns a string
        String expected = "Hello, World1!";
        String actual = App.getGreeting(); // Replace with actual method to test
        assertNotEquals(expected, actual);
    }
}