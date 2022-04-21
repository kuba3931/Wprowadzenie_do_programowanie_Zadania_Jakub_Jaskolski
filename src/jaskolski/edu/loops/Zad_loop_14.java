package jaskolski.edu.loops;

import java.util.ArrayList;

public class Zad_loop_14 {

    public static void main(String[] args) {

        String name = "Grzegorz";

        ArrayList<Object> new_name = new ArrayList<>();

        int i;
        char znak;

        for (i = 0; i < name.length(); i++) {
            znak = name.charAt(i);

            if (i % 2 == 0) {
                new_name.add(znak);
            }
            if (i + 1 == name.length()) {
                System.out.println(new_name);
            }

        }
    }
}
