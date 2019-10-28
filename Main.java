package lt.berta.god;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Human> humans = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {

            //Humans die at age more or equal to 50;
            humans.removeIf(a -> a.getAge() >= 50);

            //ciklas pirmam humans listui sukurti;
            for (int j = 0; j < 5; j++) {
                int age = random.nextInt(101);
                humans.add(new Human(age));
            }

            try {
                Thread.sleep(1000);

                //ADDING A NEW HUMAN (AGE 0);
                humans.add(new Human(0));

                //  AGING;
                humans.forEach(a -> a.setAge(a.getAge() + 1));

                System.out.println(humans);

            } catch (InterruptedException ex) {

            }
        }
        //statistika;
        Human lastIndex = humans.get(humans.size() - 1); //atimame 1, nes size, skaiciuojamas nuo 0;
        System.out.println("Iš viso sukurta žmonių: " + lastIndex.getId());
        System.out.println("Iš viso mirusių žmonių: " + (humans.size() - lastIndex.getId()));
        System.out.println("Pupuliacija šiuo metu: " + humans.size());

        // PASAULIO PABAIGA, išvalomas humans listas;
        humans.removeAll(humans);
        System.out.println("Viso žmonių po pasaulio pabaigos: " + humans.size());

    }
}




