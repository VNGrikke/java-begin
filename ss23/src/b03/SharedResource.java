package b03;

public class SharedResource extends Thread {
    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName());
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}

