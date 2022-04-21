package jaskolski.edu.loops;

public class Zad_loop_13 {

    public static void main(String[] args) {

        String wyraz = "JAVA Jest Fajna <3";
        /* mówie serio nuaczyłem się więcej na tych zajęciach niz
        na całych semetrze pythona na PWR */

        int i;
        int n =wyraz.length();
        int k = 0;
        char znak;

        for (i = 0; i < n; i++){
            znak = wyraz.charAt(i);
            if (Character.isLowerCase(znak)){
                k += 1;
            }

        }

        if (k == 0){
            System.out.println("Wyraz nie zawiera malych liter");
        }
        else{
            System.out.println("Wyraz zawiera " + k + " malych liter");
        }

    }
}
