import java.util.ArrayList;
import java.util.List;

public class b09 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> prime = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        System.out.println("Danh sach: " + numbers);
        for (Integer i : numbers) {
            if (isPrime(i)) {
                prime.add(i);
            } else if (i % 2 == 0) {
                even.add(i);
            }else {
                odd.add(i);
            }
        }

        System.out.println("Nguyen to: " + prime);
        System.out.println("Le: " + odd);
        System.out.println("Chan: " + even);


    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
