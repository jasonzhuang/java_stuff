package exception;

//1.checked exception must handle when invoke
//2.unchecked exception doesn't need handle when invoke
//3.customer exception handle or not depends on whether extends from RuntimeException
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        Printer printer = new Printer();
        //1.scenario one, exception propagate to handle
//        try {
//            try {
//                printer.aa();
//            } catch (NullPointerException e) {
//                System.out.println(e.getMessage());//never executes as type don't match
//            }
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());//output:illegal exception
//        }

        //2.scenario two: as inner exception not handled, the inner exception is reported
        //and outer exception is aborted
//        try {
//            throw new IllegalArgumentException("outer exception");
//        } finally {
//            try {
//                throw new NullPointerException("inner exception");
//            } catch(ArithmeticException e) {
//                System.out.println("Hello");//never execute
//            }
//        }

        //3.scenario three:inner exception is handled before outer exception actually bubbles
        try {
            printer.throwTwoException();
        } catch (RuntimeException e) {
            // the outer exception, whic has bubbled up from throwTwoException()
            // is handled here
            System.out.println("external catch: " + e.getMessage());
        }
    }
}
