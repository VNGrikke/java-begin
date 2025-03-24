package btPortal;

import java.util.*;

public class b07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang");
        int n = sc.nextInt();
        if (n <= 0){
            return;
        }
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < numbers.size(); i++) {
            if (map.containsKey(numbers.get(i))) {
                map.put(numbers.get(i), map.get(numbers.get(i)) + 1);
            }else {
                map.put(numbers.get(i), 1);
            }
        }

        List<Map.Entry<Integer,Integer>> newNumbers = new ArrayList<>(map.entrySet());

        newNumbers.sort(Map.Entry.comparingByValue());

        for (Map.Entry<Integer,Integer> entry : newNumbers) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

    }
}
