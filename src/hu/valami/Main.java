package hu.valami;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. feladat

      /*  System.out.println("Kérek egy évszámot:");
        System.out.print("> ");
        int year = scanner.nextInt();

        if((year>=1582) && (year%4 == 0) && (year%400==0))
        {
          System.out.println(year + " SZÖKŐÉV");
        }
        else System.out.println(year + " NEM SZÖKŐÉV");*/


        // 2. feladat

      /*  System.out.println("Kérek egy számot!");
        int szam = scanner.nextInt();
        int eredmeny;
        int counter = 0;

        if(szam > 0)
        {
            for(int i = 1; i<=szam; i++)
            {
                eredmeny = szam/i;

                if(szam%i == 0)
                {
                    System.out.println(eredmeny);
                    counter++;
                }
            }
            System.out.println("osztók száma: " + counter);
        }
        else System.out.println("Nem természetes szám!");*/


        // 3. feladat

        System.out.println("Kérek egy számot!");
        int szam = scanner.nextInt();
        int eredmeny;
        int counter = 0;

        if(szam > 0)
        {
            for(int i = 1; i<=szam; i++)
            {
                eredmeny = szam/i;

                if(szam%i == 0)
                {
                    counter++;
                }
            }
            if(counter == 2)
            {
                System.out.println("Prímszám");
            }
            else System.out.println("Nem prímszám");
        }
        else System.out.println("Nem természetes szám!");





    }
}
