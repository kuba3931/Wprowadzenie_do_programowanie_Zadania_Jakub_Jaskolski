package jaskolski.edu.loops;

import java.util.ArrayList;
import java.util.Random;

public class Zad_loop_4 {

    public static void main(String[] args) {

        ArrayList<Object> Totek = new ArrayList<>();

        Random rand = new Random();

        while (Totek.size() < 7) {

            int n = rand.nextInt(49);

            n += 1;

            if (!Totek.contains(n)) {
                Totek.add(n);
            }
            if (Totek.size() == 6) {
                System.out.println("Liczby z tego losowania to\n" + Totek);
                break;
            }
        }
    }
}
