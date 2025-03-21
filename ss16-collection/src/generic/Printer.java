package generic;

public class Printer<T> implements InterfaceGeneric {
    @Override
    public void displayData(Object data) {
        System.out.println("data: " + data);
    }
}
