package jaskolski.edu.loops;

public class Zad_loop_6 {

    public static void main(String[] args) {

        int n = 8;
        int silnia = 1;
        int i = 0;

        while (i != n) {

            i++;

            silnia *= i;

            if (i == n) {
                System.out.println("Twoja silnia to " + silnia);
            }
        }
    }
}
