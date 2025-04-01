package b01;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread dang chay" + Thread.currentThread().getName());
    }
}
