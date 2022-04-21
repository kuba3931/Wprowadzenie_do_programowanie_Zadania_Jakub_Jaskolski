package jaskolski.edu.loops;

import java.util.ArrayList;

import static java.lang.Math.*;

public class Zad_loop_15 {

    public static void main(String[] args) {

        int a = 48;
        int b = 64;
        int i;
        int c = min(a,b);

        ArrayList<Integer> dzielniki = new ArrayList<>();


        for (i = 1 ; i <= c ; i++){

            if(a % i == 0 && b % i == 0){
                dzielniki.add(i);
            }

        }
        System.out.println(dzielniki);
        int  o = dzielniki.size() - 1;
        System.out.println("Najwiekszy wspolny dzielnik to " + dzielniki.get(o));


    }
}
