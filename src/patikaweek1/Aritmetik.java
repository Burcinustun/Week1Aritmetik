package patikaweek1;

import java.util.Scanner;

public class Aritmetik {
    public static void main(String[] args) {
        int sayi1 = 0;
        int sayi2 = 0;
        int sayi3 = 0;

        Scanner input = new Scanner(System.in);
        System.out.print(" 1. sayı: " );
        sayi1 = input.nextInt();
        System.out.print(" 2. sayı: " );
        sayi2 = input.nextInt();
        System.out.print(" 3. sayı: " );
        sayi3 = input.nextInt();
        int result = sayi1+sayi2*sayi3-sayi2;
        System.out.println(" İşlem sonucu : " + result);
    }
}
