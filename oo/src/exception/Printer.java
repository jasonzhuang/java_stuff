package exception;

import java.io.IOException;

public class Printer {
    public void print() throws IOException {
        
    }

    public void copy() throws NullPointerException {
        
    }

    public void multiPrint() throws CustomerException{
        throw new CustomerException("customerException");
    }

    public void aa() {
        throw new IllegalArgumentException("illegal exception");
    }

    public void throwTwoException() {
        try {
            throw new RuntimeException("Test error 1");
        } finally {
            try {
                throw new RuntimeException("Test error 2");
            } catch (RuntimeException e) {
                System.out.println("Internal catch: " + e.getMessage());
            }
        }
    }
}
