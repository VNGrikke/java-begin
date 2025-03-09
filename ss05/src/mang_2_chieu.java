import java.util.Scanner;

public class mang_2_chieu {
    public static void main(String[] args) {
        /*
        * viet truong trinh java console
        */
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.print("Nhap vao kich thuoc cua mang: ");
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        int choice;
        do{
            System.out.println("\n********************MENU**********************");
            System.out.println("1. Nhap gia tri cac phan tu");
            System.out.println("2. Hien thi cac phan tu theo ma tran");
            System.out.println("3. Kiem tra su ton tai cua gia tri");
            System.out.println("4. Thoat");
            System.out.print("Lua chon cua ban: ");

            choice = sc.nextInt();
            switch (choice){
                case 1:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            arr[i][j] = sc.nextInt();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("%5d",arr[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Nhap vao gia tri muon kiem tra: ");
                    int value;
                    boolean check = false;
                    value = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if(arr[i][j] == value){
                                check = true;
                                System.out.printf("Gia tri %d o vi tri cot %d hang %d trong mang.\n",value, j, i);
                            }
                        }
                    }
                    if (!check){
                        System.out.printf("Gia tri %d khong ton tai trong mang.\n",value);
                    }
                    break;
                case 4:
                    break;
                default:
            }
        }while (true);
    }
}
