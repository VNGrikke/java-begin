package business;

import entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOrderBusiness {
    static Scanner sc = new Scanner(System.in);

    public static void AddOrder() {
        System.out.println("Nhap thong tin don hang");
        Order newOrder = new Order();

    }

    public static void DeleteOrder() {

    }

    public static void OrderCanceled() {}

    public static void OrderCompleted() {}

    public static void TotalOrderCompleted(Order order) {}
}
