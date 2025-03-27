package business;

import entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerBusiness {
    public static List<Customer> customers = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);



    public static void AddCustomer() {
        System.out.println("Nhap thong tin khach hang");
        Customer customer = new Customer();
        customer.inputData(sc);
        customers.add(customer);
    }

    public static void ListCustomer() {
        customers.forEach(c -> System.out.println(c));
    }
}
