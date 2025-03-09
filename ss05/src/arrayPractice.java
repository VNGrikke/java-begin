import java.util.Scanner;

public class arrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] oldArray = new int[n];
        int[] newArray = new int[0];
        boolean check = true;
        System.out.print("Nhap phan tu cua mang: ");
        for (int i = 0; i < oldArray.length; i++) {
            oldArray[i] = sc.nextInt();
        }

        System.out.print("Nhap vi tri chen: ");
        int index = sc.nextInt();
        if (index < 0){
            check = false;
        }else if (index < oldArray.length){
            newArray = new int[oldArray.length + 1];
            System.out.print("Nhap gia tri phan tu: ");
            int value = sc.nextInt();
            for (int i = 0; i < newArray.length; i++) {
                if (i < index){
                    newArray[i] = oldArray[i];
                } else if (i == index){
                    newArray[i] = value;
                }else {
                    newArray[i] = oldArray[i-1];
                }
            }
        }else{
            System.out.print("Nhap gia tri phan tu: ");
            int value = sc.nextInt();
            newArray = new int[index+1];
            newArray[index] = value;
            for (int i = 0; i < oldArray.length; i++) {
                newArray[i] = oldArray[i];
            }
        }
        if (check){
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }else{
            System.out.print("vi tri khong hop le");
        }
    }
}
