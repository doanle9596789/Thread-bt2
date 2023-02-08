package test;

import c1122h1.EvenThread;
import c1122h1.OddThread;

public class TestThread {
    Thread thread=new Thread();
    public static void main(String[] args) {
        OddThread oddThread=new OddThread();
        EvenThread evenThread=new EvenThread();
        try {

            oddThread.join();
            evenThread.run();
            oddThread.run();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
