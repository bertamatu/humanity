package lt.berta.god;

public class Human {
    private static int ID = 1;
    private int id;
    private int age;

    public Human(int age) {
        this.id = ID++;
        this.age = age;
    }

//    public humansDie(){
//    }


    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
