package exception_use;

public class Runner {
    public void doSome() {
        //exception handle order is serious, following code can't compile
        // border exception should put after subException
//        try {
//            File f = new File("");
//        } catch (Exception e) {
//            
//        } catch (IOException e) {
//            
//        }
    }

    public void doOther() {
        throw new MyError();
    }

    //error handle order mechanism is same as exception
//    public void notSafe() {
//        try {
//            doOther();
//        } catch (Error e) {
//            
//        } catch (MyError e) {
//            
//        }
//    }

    public void doSomeStuff() throws MyException{
        try {
            throw new MyException();
        } catch (MyException e) {
           throw e;//if method not declare throws MyException, can't compile
        }
    }
}

class MyException extends Exception {
    
}

class MyError extends Error {
    
}
