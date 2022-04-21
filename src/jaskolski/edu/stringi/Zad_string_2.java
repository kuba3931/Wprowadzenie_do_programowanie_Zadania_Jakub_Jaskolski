package jaskolski.edu.stringi;

import java.util.ArrayList;

public class Zad_string_2 {

    public static void main(String[] args) {

        ArrayList<String> psy = new ArrayList<>();
        psy.add("Znowu pies zjadł moją pracę domową");
        psy.add("Nie wiem jak chinczycy moga jesc psy");


        for (String czy_pies : psy) {
            System.out.println(czy_pies.contains("pies"));
        }
    }
}
