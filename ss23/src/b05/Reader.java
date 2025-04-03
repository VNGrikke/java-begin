package b05;

public class Reader extends Thread {
    private SharedData sharedData;

    public Reader(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public synchronized void run() {
        while (true) {
                try {
                    if (sharedData.getMessage() != null) {
                        wait();
                        System.out.println("\nReader: " + sharedData.getMessage());
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            }
        }

}
