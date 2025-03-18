public class b02 {
    public static final double GRADUATION_RATE = 5.0;

    public static void main(String[] args) {
        double[] marks = {7.5, 8.0, 6.5};
        double averageScore = calcAvgScore(marks);

        System.out.println(averageScore >= GRADUATION_RATE ? "Pass" : "Fail");
    }

    public static double calcAvgScore(double[] marks) {
        double totalScore = 0;
        for(double score: marks) {
            totalScore += score;
        }
        return totalScore/marks.length;
    }

}