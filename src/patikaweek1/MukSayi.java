package patikaweek1;

import java.util.Scanner;

public class MukSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: " );

        int number = input.nextInt();
        int toplam = 0;
        for (int i = 1; i<number; i++){
            if(number%i == 0){
                toplam += i;
            }
        }
        if(toplam==number){
            System.out.print(number+ " Mükemmel sayıdır.");
        }
        else{
            System.out.println(number+ " Mükemmel sayı değildir.");
        }
    }
}
