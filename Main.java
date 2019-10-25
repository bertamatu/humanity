package lt.berta.god;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i <= 100; i++) {
            for (int j = 1; j <= 10; j++) {
                int age = random.nextInt(101);
                humans.add(new Human(age));
            }

            //TODO

        }


        System.out.println("Is viso sukurta zmoniu: " + humans.size());
        System.out.println(humans);
    }

}
