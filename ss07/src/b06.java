public class b06 {
    public static void main(String[] args) {
        int n = 1000;
        String text = " World";

        String str = "Hello";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            str += text;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thời gian với String: " + (endTime - startTime) + " ms");

        StringBuilder sb = new StringBuilder("Hello");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sb.append(text);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian với StringBuilder: " + (endTime - startTime) + " ms");

        StringBuffer sbf = new StringBuffer("Hello");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sbf.append(text);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian với StringBuffer: " + (endTime - startTime) + " ms");
    }
}
