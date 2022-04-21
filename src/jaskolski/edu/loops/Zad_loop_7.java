package jaskolski.edu.loops;

import java.util.Scanner;

public class Zad_loop_7 {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);


            System.out.println("ile rzedow potrzebujesz??");

            int wiersze = sc.nextInt();

            System.out.println("Oto twoja wieza");

            for (int i=0; i< wiersze;i++ )
            {
                for (int j=0; j<=i; j++)
                {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }

            System.out.println("Oraz twoja choinka");

            for (int i= 0; i <= wiersze-1 ; i++)
            {
                for (int j = wiersze-1; j>i; j--)
                {
                    System.out.print(" ");
                }
                for (int k=0; k<=i; k++)
                {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }
    }
