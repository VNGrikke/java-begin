package b05;

public class Reader extends Thread {
    private SharedData sharedData;

    public Reader(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (sharedData) {
                System.out.println("\nDa doc:" + sharedData.getMessage());

                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            }
        }

        }
    }
