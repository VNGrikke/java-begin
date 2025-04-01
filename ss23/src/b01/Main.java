package b01;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        thread1.setName("Thread1");
        thread1.start();
    }
}
