package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {

    @Test
    public void testIssueBook() {
        BookService service = new BookService();
        String result = service.issueBook();
        assertEquals("Book issued successfully!", result);
    }
}
