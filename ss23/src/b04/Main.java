package b04;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        Thread thread2 = new Thread(new MyRunnable(), "Thread2");
        Thread thread3 = new Thread(new MyRunnable(), "Thread3");
        thread1.setName("thread1");
        thread1.start();

        try {
            thread1.join();
            thread2.start();
            thread3.start();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
