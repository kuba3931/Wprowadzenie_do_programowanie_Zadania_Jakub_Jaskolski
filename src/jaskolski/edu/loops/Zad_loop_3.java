package jaskolski.edu.loops;

import java.util.Scanner;

public class Zad_loop_3 {

    public static void main(String[] args) {

        int Zgad = 56;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int i = 1;

        while (i != Zgad) {

            i = scan.nextInt();

            if (i < Zgad) {
                System.out.println("Wiecej");
            }

            if (i > Zgad) {
                System.out.println("Mniej");

            }
            if (i == Zgad) {
                System.out.println("Wow, wreszcie zgadles");
            }
        }
    }
}

