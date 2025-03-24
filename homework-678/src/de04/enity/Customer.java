package de04.enity;

import de04.validate.Validator;
import java.util.Scanner;

public class Customer implements IApp {
    private String customerId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private boolean gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String customerType;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Customer(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    @Override
    public void inputData(Scanner sc) {
        System.out.print("Nhập họ khách hàng: ");
        lastName = Validator.validateString(sc, 1, 30);

        System.out.print("Nhập tên khách hàng: ");
        firstName = Validator.validateString(sc, 1, 50);

        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        dateOfBirth = Validator.validateDate(sc);

        System.out.print("Nhập giới tính (true - Nam, false - Nữ): ");
        gender = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Nhập địa chỉ: ");
        address = Validator.validateString(sc, 1, 255);

        System.out.print("Nhập số điện thoại: ");
        phoneNumber = Validator.validatePhoneNumber(sc);

        System.out.print("Nhập email: ");
        email = Validator.validateEmail(sc);

        System.out.print("Nhập loại khách hàng (cá nhân/doanh nghiệp): ");
        customerType = Validator.validateString(sc, 1, 50);
    }

    @Override
    public void displayData() {
        System.out.println("Mã KH: " + customerId + " | Họ: " + lastName + " | Tên: " + firstName +
                " | Ngày sinh: " + dateOfBirth + " | Giới tính: " + (gender ? "Nam" : "Nữ") +
                " | Địa chỉ: " + address + " | SĐT: " + phoneNumber +
                " | Email: " + email + " | Loại KH: " + customerType);
    }
}
