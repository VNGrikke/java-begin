package b04;

public interface Shape {

    default float area(){
        return 0;
    }

    static void description(){
        System.out.println("This is shape.");
    }

}
