package timer;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 
 * TimerTask is an abstract class, also implements Runnable, it's
 * a good example for explaining using abstract class or interface
 */
public class Reminder {
    Timer timer;

    public Reminder(int seconds) {
      timer = new Timer();
      timer.schedule(new RemindTask(), seconds * 100, 1000);
    }

    class RemindTask extends TimerTask {
      public void run() {
          System.out.println("Time's up!");
        //timer.cancel(); //Terminate the timer thread
      }
    }

    public static void main(String args[]) {
      System.out.println("About to schedule task.");
      new Reminder(5);
      System.out.println("Task scheduled.");
    }
  }