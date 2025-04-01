package entity;

import presentation.ShopManagement;

import java.time.LocalDate;
import java.util.Scanner;

public class Order implements IApp {
    private static int countId;
    private int id;
    private Customer customer;
    private LocalDate orderDate;
    private double totalAmount;
    private Boolean status;

    public Order() {
        id = ++countId;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Order(int id, Customer customer, LocalDate orderDate, double totalAmount, Boolean status) {
        this.id = id;
        this.customer = customer;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        do {
            if (ShopManagement.customers.isEmpty() ) {
                return null;
            }

            ShopManagement.customers.forEach( customer1 -> System.out.println(customer1.getId() + ": " + customer1.getName()) );
        }
        customer = customer;
        orderDate = LocalDate.parse(scanner.nextLine());
        totalAmount = scanner.nextDouble();
        status = false;
        id = ++countId;

    }

    @Override
    public String toString() {
        return "| " + id + " | " + customer + " | " + orderDate + " | " + totalAmount + " | " + status + " |";
    }
}
