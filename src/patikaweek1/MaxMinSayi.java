package patikaweek1;

import java.util.Scanner;

public class MaxMinSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz? " );
        int N = input.nextInt();
        int min = 0;
        int max = 0;
        int number; // kullanıcıdan sayı almak için bir number değişkeni tanımladık.

        for(int i = 1; i <= N; i++){
            System.out.print(i+ ". sayıyı giriniz : " );
            number = input.nextInt(); // başına int yazmaya gerek yok çünkü zaten yukarıda int number olarak tanımladık

            if(number<min || min==0){
                min = number;
            }
            if (number>max){
                max = number;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);


    }
}
