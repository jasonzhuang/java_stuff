package state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) {
        StateMachine stateMachine = new StateMachine();
        while(true) {
            get_line();
            stateMachine.pull();
        }
    }

    static void get_line() {
        BufferedReader in = new BufferedReader(
                new InputStreamReader( System.in ));
       try {
           in.readLine();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
