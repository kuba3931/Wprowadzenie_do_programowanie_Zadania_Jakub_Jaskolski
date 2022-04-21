package jaskolski.edu.loops;

import java.util.Objects;
import java.util.Scanner;

public class Zad_loop_5 {

    public static void main(String[] args) {

        String correct_pass = "Polska";

        Scanner user_pass = new Scanner(System.in);

        String input_pass = "";

        System.out.println("Podaj haslo");

        while (!Objects.equals(input_pass, correct_pass)) {

            input_pass = user_pass.nextLine();

            if (Objects.equals(input_pass, correct_pass)) {
                System.out.println("Zalogowano pomyslnie");
            } else {
                System.out.println("Haslo niepoprawne, sprobuj ponownie");
            }
        }
    }
}
