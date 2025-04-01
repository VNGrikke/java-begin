package b04;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
