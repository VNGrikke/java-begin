public class b04 {
    public static void main(String[] args) {
        String initialString = "abcdefghij".repeat(100000);

        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder(initialString);
        sb.reverse();
        sb.insert(500000, "INSERTED");
        sb.delete(400000, 400010);
        sb.replace(600000, 600010, "REPLACED");
        long endTime = System.nanoTime();
        long durationSB = endTime - startTime;

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer(initialString);
        sbf.reverse();
        sbf.insert(500000, "INSERTED");
        sbf.delete(400000, 400010);
        sbf.replace(600000, 600010, "REPLACED");
        endTime = System.nanoTime();
        long durationSBF = endTime - startTime;

        System.out.println("Thời gian thực thi với StringBuilder: " + durationSB + " ns");
        System.out.println("Thời gian thực thi với StringBuffer: " + durationSBF + " ns");
    }
}
