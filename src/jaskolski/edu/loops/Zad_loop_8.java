package jaskolski.edu.loops;

import java.util.ArrayList;

public class Zad_loop_8 {

    public static void main(String[] args) {

        String wyraz = "72 Zjadlem wczoraj 5 bulki, 1 tosty, i 8 ciastek 27";

        ArrayList<Object> liczby = new ArrayList<>();

        int i;
        char znak;

        for (i = 0; i < wyraz.length(); i++) {
            znak = wyraz.charAt(i);

            if (Character.isDigit(znak)) {
                liczby.add(znak);
            }
            if (i + 1 == wyraz.length()) {
                System.out.println(liczby);
            }
        }
    }
}
