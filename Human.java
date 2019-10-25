package lt.berta.god;

public class Human {
    private static int ID = 1;
    private int id;
    private int age;
    private String gender;

    public Human(int age) {
        this.id = ID++;
        this.age = age;
//        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
