package business;

import entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOrderBusiness {
    public static List<Order> orderList = new ArrayList<Order>();
    static Scanner sc = new Scanner(System.in);

    public static void AddOrder() {
        System.out.println("Nhap thong tin don hang");
        Order newOrder = new Order();
        orderList.add(newOrder.inputData(sc));

    }

    public static void DeleteOrder() {

    }

    public static void OrderCanceled() {}

    public static void OrderCompleted() {}

    public static void TotalOrderCompleted(Order order) {}
}
