package b05;


public class Writer extends Thread {
    private SharedData sharedData;

    public Writer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public synchronized void run() {
        System.out.println("writer: dang nhan...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sharedData.setMessage("Mai di hoc khong");
        System.out.println("writer: " + sharedData.getMessage());
    }
}
