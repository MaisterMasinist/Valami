package hu.valami;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy évszámot:");
        System.out.print("> ");
        int year = scanner.nextInt();

        if((year>=1582) && (year%4 == 0))
        {
          System.out.println(year + " SZÖKŐÉV");
        }
        else if((year%100 == 0) && (year%400==0)) System.out.println("SZÖKŐÉV");
        else System.out.println(year + "NEM SZÖKŐÉV");

    }
}
