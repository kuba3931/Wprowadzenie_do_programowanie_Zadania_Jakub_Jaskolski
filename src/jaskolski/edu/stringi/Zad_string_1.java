package jaskolski.edu.stringi;

import java.util.ArrayList;

public class Zad_string_1 {

    public static void main(String[] args) {

        // Zadanie 1

        ArrayList<String> Imiona = new ArrayList<>();
        Imiona.add("Jakub");
        Imiona.add("Ewelina");
        Imiona.add("Zapjur");

        for (String test : Imiona) {
            System.out.println(test.startsWith("J"));
        }

        }






    }

