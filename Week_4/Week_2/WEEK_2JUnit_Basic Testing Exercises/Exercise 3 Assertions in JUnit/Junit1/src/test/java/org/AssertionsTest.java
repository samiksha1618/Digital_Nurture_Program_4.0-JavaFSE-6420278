package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testUserAssertions() {
        System.out.println("Starting UserAssertions test...");

        String username = "Samiksha";

        assertEquals("Username should be Samiksha", "Samiksha", username);
        System.out.println("Username matches expected value");

        assertTrue("Username should have length > 3", username.length() > 3);
        System.out.println("Username length check passed");

        assertFalse("Username should not be empty", username.isEmpty());
        System.out.println("Username is not empty");

        Object nullValue = null;
        assertNull("Value should be null", nullValue);
        System.out.println("Null value check passed");

        assertNotNull("Username should not be null", username);
        System.out.println("Username is not null");

        System.out.println("All assertions passed successfully.");
    }
}

