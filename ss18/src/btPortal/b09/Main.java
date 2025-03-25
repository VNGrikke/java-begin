package btPortal.b09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Product> products = new HashMap<>();

        do {

            System.out.println("\n********MENU*********");
            System.out.println("0. Danh sach");
            System.out.println("1. Them sp");
            System.out.println("2. cap nhap so luong hoac gia");
            System.out.println("3. xoa san pham");
            System.out.println("4. tinh tongn gia tri sp trong kho");
            System.out.println("5. thoat");
            System.out.println("Nhap lua chon ");
            switch (scanner.nextInt()){
                case 0:
                    for (Map.Entry<Integer, Product> entry : products.entrySet()) {
                        System.out.println("| "+ entry.getKey()+" | "+entry.getValue().getName()+" | "+entry.getValue().getPrice()+" | "+entry.getValue().getQuantity()+" | ");
                    }
                    break;
                case 1:
                    System.out.println("Nhap thong tin sp");
                    System.out.print("Ma sp: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nhap ten san pham: ");
                    String name = scanner.nextLine();

                    System.out.print("Nhap gia: ");
                    float price = scanner.nextFloat();

                    System.out.print("So luong: ");
                    int quantity = scanner.nextInt();

                    if (products.containsKey(id)) {
                        System.out.println("ma sp da ton tai. nhap cai khac");
                        break;
                    }else {
                        products.put(id, new Product(name,price,quantity));
                    }
                break;

                case 2:
                    System.out.println("NHap ma san pham");
                    int searchId = scanner.nextInt();
                    if (products.containsKey(searchId)) {
                        System.out.println("Chon thong tin cap nhat");
                        System.out.println("1. Gia sp");
                        System.out.println("2. So luong");
                        if (scanner.nextInt() == 1) {
                            float newPrice = scanner.nextFloat();
                            if (newPrice < 0){
                                System.out.println("Gia khong dc nho hon 0");
                                break;
                            }
                            products.get(searchId).updateProduct(newPrice,0,1);
                        }else if (scanner.nextInt() == 2) {
                            int newQuantity = scanner.nextInt();
                            if (newQuantity < 0){
                                System.out.println("so luong khong dc nho hon 0");
                                break;
                            }
                            products.get(searchId).updateProduct(0,newQuantity,2);
                        }
                    }else {
                        System.out.println("ma san pham khong ton tai");
                    }
                break;

                case 3:
                    System.out.println("Nhap ma san pham");
                    searchId = scanner.nextInt();
                    if (products.containsKey(searchId)) {
                        products.remove(searchId);
                        break;
                    }
                    System.out.println("san pham khong ton tai");
                break;

                case 4:
                    System.out.println("Tong gia tat cac sp trong kho");
                    float sumprice = 0;
                    for (Map.Entry<Integer, Product> entry : products.entrySet()) {
                        sumprice += entry.getValue().sumPrice();
                    }
                    System.out.println(sumprice);
                break;

                case 5:
                    System.out.println("Thoat");
                    return;
                default:
                    System.out.println("sai cu phap");
            }
        }while (true);
    }
}
