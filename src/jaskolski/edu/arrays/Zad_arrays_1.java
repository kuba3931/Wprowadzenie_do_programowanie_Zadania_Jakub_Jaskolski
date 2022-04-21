package jaskolski.edu.arrays;

public class Zad_arrays_1 {

    public static void main(String[] args) {

        int[] liczby = new int[] {2, 3, 4, 34};
        int[] cyferki = new int[] {34, 5, 8, 12};

        first(liczby);
        first(cyferki);

    }

    public static void first(int[] x) {

        System.out.println("Pierwsza liczba z tablicy to " + x[0]);

    }
}

