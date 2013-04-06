package exception;

import junit.framework.TestCase;

public class Test extends TestCase {
    public void testException() {
        Printer printer = new Printer();
        try {
            printer.aa();
            fail("expected exception did not throw");//never execute
        } catch (IllegalArgumentException expected) {
            assertEquals("hello", expected.getMessage());
        }
    }
}
