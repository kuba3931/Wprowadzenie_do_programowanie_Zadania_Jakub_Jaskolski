package jaskolski.edu.loops;

import java.util.ArrayList;

public class Zad_loop_12 {

    public static void main(String[] args) {

        String wyraz = "Programowanie";

        ArrayList<Object> odwrot = new ArrayList<>();

        int i = wyraz.length() - 1;
        char znak;

        while (i + 1 != 0) {
            znak = wyraz.charAt(i);

            odwrot.add(znak);

            i--;

            if (i + 1 == 0) {
                System.out.println(odwrot);
            }
        }
    }
}
