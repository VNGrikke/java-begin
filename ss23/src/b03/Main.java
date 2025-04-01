package b03;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(sharedResource);
        Thread thread2 = new Thread(sharedResource);

        thread1.setName("Luong 1");
        thread2.setName("Luong 2");

        thread1.start();
        thread2.start();
    }
}
