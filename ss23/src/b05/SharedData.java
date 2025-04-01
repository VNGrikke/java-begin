package b05;

public class SharedData {
    private String message;

    public synchronized String getMessage() {
        return message;
    }

    public synchronized void setMessage(String message) {
        this.message = message;
        notify();
    }
}