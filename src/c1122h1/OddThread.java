package c1122h1;

public class OddThread extends Thread{
    private Thread myThread;

    public OddThread(Thread myThread) {
        this.myThread = myThread;
    }

    public OddThread() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i%2!=0){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
