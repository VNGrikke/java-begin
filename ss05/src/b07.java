import java.util.Scanner;

public class b07 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap vao do dai cua mang: ");
       int n = sc.nextInt();
       System.out.print("Nhap vao cac phan tu cua mang: ");
       int[] arr = new int[n];
       int countOfEven = 0;
       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
           if (arr[i] % 2 == 0) {
               countOfEven++;
           }
       }

       int indexEven = 0;
       int indexOdd = countOfEven;
       int[] result = new int[n];
       for (int i = 0; i < n; i++) {
           if (arr[i] % 2 == 0) {
               if ( indexEven < countOfEven){
                   result[indexEven++] = arr[i];
               }
           } else {
               result[indexOdd++] = arr[i];
           }
       }

       System.out.print("mang sau khi sap xep: ");
       for (int i = 0; i < n; i++) {
           System.out.print(result[i] + " ");
       }
    }
}
