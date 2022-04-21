package jaskolski.edu.methods;

public class Zad_methods_2 {

    public static void main(String[] args) {

        divide(15, 5);
        divide(8, 3);
        divide(8, 0);

    }

    public static void divide(int a, int b) {

        if (b == 0) {
            System.out.println("Nie moge podzielic przez zero");

        } else if (a % b == 0) {
            System.out.println(a / b);

        } else {
            System.out.println(a / b + "   r. " + a % b);
        }

    }
}
