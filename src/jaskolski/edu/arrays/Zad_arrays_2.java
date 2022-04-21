package jaskolski.edu.arrays;

public class Zad_arrays_2 {

    public static void main(String[] args) {

        int[] liczby2 = new int[] {2, 3, 4, 34, 78};
        int[] cyferki2 = new int[] {34, 5, 8, 12, 5};

        last(liczby2);
        last(cyferki2);

    }

    public static void last(int[] x) {

        System.out.println("Ostatnia liczba z tablicy to " + x[x.length - 1]);
    }
}
