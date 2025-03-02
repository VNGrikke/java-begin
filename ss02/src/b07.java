import java.util.Scanner;

public class b07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thời gian ban đầu:");
        System.out.print("Giờ: ");
        int initialHour = scanner.nextInt();
        System.out.print("Phút: ");
        int initialMinute = scanner.nextInt();
        System.out.print("Giây: ");
        int initialSecond = scanner.nextInt();

        System.out.println("Nhập khoảng thời gian cần cộng thêm:");
        System.out.print("Giờ: ");
        int addHour = scanner.nextInt();
        System.out.print("Phút: ");
        int addMinute = scanner.nextInt();
        System.out.print("Giây: ");
        int addSecond = scanner.nextInt();

        int initialTimeInSeconds = initialHour * 3600 + initialMinute * 60 + initialSecond;

        int additionalTimeInSeconds = addHour * 3600 + addMinute * 60 + addSecond;

        int totalTimeInSeconds = initialTimeInSeconds + additionalTimeInSeconds;

        int hour = (totalTimeInSeconds / 3600) % 24;
        int minute = (totalTimeInSeconds % 3600) / 60;
        int second = totalTimeInSeconds % 60;

        System.out.printf("tổng thời gian: %02d:%02d:%02d%n", hour, minute, second);
    }
}