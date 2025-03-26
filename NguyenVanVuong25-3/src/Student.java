public class Student {
    private String name;
    private int age;
    private float avgScore;

    public Student(String name, int age, float avgScore) {
        this.name = name;
        this.age = age;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getAvgScore() {
        return avgScore;
    }

    @Override
    public String toString() {
        return name + " | " + age + " | " + avgScore + " | ";
    }

//    @Override
//    public int compareTo(Student o){
//        return Float.compare(this.avgScore, o.avgScore);
//    }


}
