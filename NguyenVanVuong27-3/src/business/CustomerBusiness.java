package business;

import entity.Customer;

import java.util.Scanner;

import static presentation.ShopManagement.customers;

public class CustomerBusiness {
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
