package b10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContactManager {
    private Set<Contact> contacts = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n1. Them sdt");
            System.out.println("2. Xoa sdt");
            System.out.println("3. Tim kiem sdt");
            System.out.println("4. Hien thi danh sach sdt");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    displayContacts();
                    break;
                case 5:
                    System.out.println("Thoat");
                    System.exit(0);
                default:
                    System.out.println("Khong hop le:]]");
            }
        }
    }


    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        manager.menu();
    }

    public void addContact() {
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhap so dien thoai: ");
        String phoneNumber = scanner.nextLine();

        Contact newContact = new Contact(name, phoneNumber);
        if (contacts.contains(newContact)) {
            System.out.println("So dien thoai da ton tai!");
        } else {
            contacts.add(newContact);
            System.out.println("Them lien he thanh cong!");
        }
    }

    public void removeContact() {
        System.out.print("Nha so dien thoai can xoa: ");
        String phoneNumber = scanner.nextLine();

        Contact contactToRemove = null;
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                contactToRemove = c;
                break;
            }
        }

        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong tim thay!");
        }
    }

    public void searchContact() {
        System.out.print("Nhap so dien thoai can tim: ");
        String phoneNumber = scanner.nextLine();

        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Da tim thay: " + contact);
                return;
            }
        }
        System.out.println("Khong tim thay!");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Danh sach trong.");
        } else {
            System.out.println("danh sach lien he");
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }
    }
}
