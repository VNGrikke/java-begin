public class b04 {
    public static final double EXCELLENT_SCORE = 8;
    public static final double GOOD_SCORE = 5;

    public static void generateReport(String name, int age, double[] scores) {
        System.out.println("Name: " + name + "\nAge: " + age);
        System.out.println("Average score: " + avgScore(scores) + "\nGrade: " + scoreRate(avgScore(scores)));
    }


    public static double avgScore(double[] scores) {
        double sum = 0;
        for(double score: scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static String scoreRate(double score) {
        return (score >= EXCELLENT_SCORE) ? "Excellent" :
                (score >= GOOD_SCORE) ? "Good" : "Fail";
    }
}
