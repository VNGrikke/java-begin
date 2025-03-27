package entity;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

public class Order implements IApp {
    private static int countId;
    private int id;
    private Customer customer;
    private LocalDate orderDate;
    private double totalAmount;
    private Boolean status;

    public Order() {}

    public int getCountId() {
        return countId;
    }

    public void setCountId(int countId) {
        this.countId = countId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Order(int countId, int id, Customer customer, LocalDate orderDate, double totalAmount, Boolean status) {
        this.countId = countId;
        this.id = id;
        this.customer = customer;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = false;
    }

    @Override
    public Order inputData(Scanner scanner) {
        id = ++countId;
        customer = customer;
        orderDate = LocalDate.parse(scanner.nextLine());
        totalAmount = scanner.nextDouble();
        status = false;
        return null;
    }

    @Override
    public String toString() {
        return "| " + id + " | " + customer + " | " + orderDate + " | " + totalAmount + " | " + status + " |";
    }
}
