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

        /* System.out.println("Kérek egy számot!");
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

        /*System.out.println("Kérek egy számot!");
        int szam = scanner.nextInt();
        int eredmeny;
        int counter = 0;

        if(szam >= 0)
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
        else System.out.println("Nem természetes szám!");*/


        // 4. feladat

       /*System.out.println("Kérek egy számot!");
        int szam = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kerem a masodik szamot!");
        int szam1 = scanner.nextInt();
        int eredmeny;
        int eredmeny1;
        int counter = 0;        


        if (szam > 0) {
            for (int i = 1; i <= szam; i++) {
                eredmeny = szam / i;

                if (szam % i == 0) {
                    System.out.println(eredmeny);
                    counter++;
                }
            }
            for (int i = 1; i <= szam1; i++) {
                eredmeny1 = szam1 / i;

                if (szam1 % i == 0) {
                    System.out.println(eredmeny1);
                    counter++;
                }


            }
        }      */

        // 5. feladat

        /*System.out.println("Adj meg egy szamot!");
        int elso = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Adj meg meg egy szamot!");
        int masodik = scanner.nextInt();
        scanner.nextLine();

        int eredmeny;

        if (masodik!=0) {
            eredmeny = elso/masodik;
            System.out.println("A ket szam elosztva: " + eredmeny);
        }else {
            System.out.println("Nullaval nem osztunk");
        }*/


        // 6. feladat

       /* System.out.println("Adj meg egy szamot!");
        int szam = scanner.nextInt();
        scanner.nextLine();

        while (szam > 0) {
            System.out.println("A szam: " + szam);
            szam--;
        }
        System.out.println("A szam: " + szam);*/


        // 7. feladat

       /* System.out.println("Adj meg egy szamot!");
        int szam = scanner.nextInt();
        scanner.nextLine();

        boolean negativ = szam < 0;
        boolean pozitiv = szam > 0;

        if (negativ){
            System.out.println("A szam negativ");
        } else if (pozitiv){
            System.out.println("A szam pozitiv");
        } else {
            System.out.println("A szam nulla");
        }*/

        // 8. feladat

        /*System.out.println("Milyen szinu a lampa?");
        String lampa = scanner.nextLine();

        if (lampa.equalsIgnoreCase("zold")){
            System.out.println("SZABAD");
        } else if (lampa.equalsIgnoreCase("sarga")){
            System.out.println("LASSITS");
        } else if (lampa.equalsIgnoreCase("piros")){
            System.out.println("MEGALLJ");
        } else {
            System.out.println("NEM TUDOM");
        }*/

        // 9. feladat

        /*System.out.println("Milyen evszak van ma?");
        String evszak = scanner.nextLine();

        boolean tel = evszak.equalsIgnoreCase("december")
                || evszak.equalsIgnoreCase("januar")
                || evszak.equalsIgnoreCase("februar");
        boolean tavasz = evszak.equalsIgnoreCase("marcius")
                || evszak.equalsIgnoreCase("aprilis")
                || evszak.equalsIgnoreCase("majus");
        boolean nyar = evszak.equalsIgnoreCase("junius")
                || evszak.equalsIgnoreCase("julius")
                || evszak.equalsIgnoreCase("augusztus");
        boolean osz = evszak.equalsIgnoreCase("szeptember")
                || evszak.equalsIgnoreCase("oktober")
                || evszak.equalsIgnoreCase("november");

        if (tel){
            System.out.println("Tel");
        } else if (tavasz){
            System.out.println("Tavasz");
        } else if (nyar){
            System.out.println("Nyar");
        } else if (osz){
            System.out.println("Osz");
        } else {
            System.out.println("Nem meghatarozhato!");
        }*/

        // 10. feladat

        /*System.out.println("Kerek egy szamot!");
        int szam = scanner.nextInt();
        int x = 1;

        while (x<szam){
            System.out.println(x++);
        }*/







    }
}