public class b06 {
    public static void main(String[] args) {
        int[] originalArray = {12, 50, 23, 12, 99, 99, 12, 23, 50, 7, 99, 23, 23, 7, 50, 7, 7, 99, 23, 99};
        int[] markingArray = new int[1000];

        for (int i = 0; i < originalArray.length; i++) {
            markingArray[originalArray[i]]++;
        }

        int maxCount = 0;
        for (int i = 0; i < markingArray.length; i++) {
            if (markingArray[i] > maxCount) {
                maxCount = markingArray[i];
            }
        }

        for (int i = 0; i < markingArray.length; i++) {
            if (markingArray[i] == maxCount) {
                System.out.println(i + ", Số lần xuất hiện: " + maxCount);
            }
        }
    }
}
