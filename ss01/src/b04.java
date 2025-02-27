public class b04 {
    public static class Person {
        String name;
        int age;
        String country;

        public Person(String name, int age, String country) {
            this.name = name;
            this.age = age;
            this.country = country;
        }
    }

    public static void main(String[] args) {
        Person[] people = new Person[8];
        people[0] = new Person("Nguyen Van An", 20, "Viet Nam");
        people[1] = new Person("Tran Thi Bich", 21, "Nhat");
        people[2] = new Person("Le Hoang Nam", 27, "Han");
        people[3] = new Person("Pham Minh Duc", 30, "Trung");
        people[4] = new Person("Hoan Lan Chi", 25, "Meo");
        people[5] = new Person("Do Thuy Duong", 10, "An Do");
        people[6] = new Person("Bui Thanh Hung", 50, "Phap");
        people[7] = new Person("Vu Hai Yen", 60, "Duc");

        System.out.println("+---------------------------------------------------------------+");
        System.out.println("| Ho Va Ten           |   Tuoi    |        Quoc Gia             |");
        System.out.println("+---------------------------------------------------------------+");
        for (int i = 0; i < people.length; i++) {
            System.out.printf("| %-20s | %-10d | %-25s |\n",
                    people[i].name,
                    people[i].age,
                    people[i].country);
        }
        System.out.println("+---------------------------------------------------------------+");
    }
}