package btPortal.b06;

public class Student {
    private double math;
    private double chemistry;
    private double english;


    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public Student( double math, double chemistry, double english) {
        this.math = math;
        this.chemistry = chemistry;
        this.english = english;
    }

    public double avgScore() {
        return (math + chemistry + english)/3;
    }


}

