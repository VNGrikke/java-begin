package b05;

public class Main {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        sharedData.setMessage("Mai di hoc");
        Thread writer = new Writer(sharedData);
        Thread reader = new Reader(sharedData);


        writer.start();
        reader.start();
    }
}