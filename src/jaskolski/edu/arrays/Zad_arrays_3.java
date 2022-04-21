package jaskolski.edu.arrays;

public class Zad_arrays_3 {

    public static void main(String[] args) {


        int[] liczby3 = new int[] {2, 3};
        int[] cyferki3 = new int[] {5, 8, 3};
        int[] cyferki4 = new int[] {5};
        int[] cyferki5 = new int[] {5, 8};

        sumowanie(liczby3);
        sumowanie(cyferki3);
        sumowanie(cyferki4);
        sumowanie(cyferki5);
    }

    public static void sumowanie(int[] x) {

        if (x.length != 2){
            System.out.println("Wymagana tablica 2 elementowa");
            return;
        }

        int k;
        int i;
        int suma = 0;

        for (i = 0; i< x.length; i++){
            k = x[i];
            suma += k;
        }

        System.out.println("Suma twoich liczb to " + suma);
    }
}
