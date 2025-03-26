import java.util.function.Function;

public class b02 {
    public static void main(String[] args) {
        Function<Integer,Integer> fx = cacul();
        System.out.println(fx.apply(1));
        System.out.println(fx.apply(2));
        System.out.println(fx.apply(3));
    }

    public static Function<Integer, Integer> cacul(){
        return x -> x*x + 3*x + 2;
    }
}
