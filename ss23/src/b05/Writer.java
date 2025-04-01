package b05;


public class Writer extends Thread {
    private SharedData sharedData;

    public Writer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try{
                if (sharedData.getMessage().equals("")) {
                    wait();
                }else {

                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }

        }
    }
