package b09;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, "Quý", LocalDate.of(2025, 3, 20), LocalDate.of(2025, 3, 25)),
                new Order(2, "Lan", LocalDate.of(2025, 3, 21), null),
                new Order(3, "Minh", LocalDate.of(2025, 3, 22), LocalDate.of(2025, 3, 23)),
                new Order(4, "Huyền", LocalDate.of(2025, 3, 23), null),
                new Order(5, "Việt", LocalDate.of(2025, 3, 23), LocalDate.of(2025, 3, 30))
        );

        List<Order> delivered = orders.stream()
                .filter(order -> order.getDeliveryDate().isPresent())
                .collect(Collectors.toList());

        List<Order> notDelivered = orders.stream()
                .filter(order -> order.getDeliveryDate().isEmpty())
                .collect(Collectors.toList());

        int deliveredInTime = (int) orders.stream()
                .filter(order -> order.getDeliveryDate()
                        .map(date -> date.isBefore(LocalDate.parse("2025-03-24")) &&
                                date.isAfter(LocalDate.parse("2025-03-16")))
                        .orElse(false))
                .count();


//        delivered.forEach(orders::toString);



        System.out.println(deliveredInTime);
    }
}