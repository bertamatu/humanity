package lt.berta.god;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1500);

                for (int j = 1; j <= 10; j++) {
                    int age = random.nextInt(101);
                    humans.add(new Human(age));
                }
                int age = 0;
                humans.add(new Human(age));
                age++;
                humans.removeIf(a -> a.getAge() > 80);

                //TODO aprasyti metodus tvarkingai;


                System.out.println("Is viso sukurta zmoniu: " + humans.size());
                System.out.println(humans);
                System.out.println("Pupuliacija šiuo metu: " + humans.size());
            } catch (InterruptedException ex) {
            }
        }
    }

}
