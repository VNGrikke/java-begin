package b09;

public class Developer extends Employee {
    private String language;

    public Developer() {
        super();
        this.language = "Unknown";
    }

    public Developer(String name, String id, double salary, String language) {
        super(name, id, salary);
        this.language = language;
    }

    public String language() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ngôn ngữ lập trình: " + language;
    }
}
