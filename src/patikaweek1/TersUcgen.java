package patikaweek1;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısı: ");
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
            }
            // buraya system.out.print(" ") yazsaydık dik üçgen değil, eşkenar gibi bir üçgen çıkardı.

            for(int s=0; s<(2*(n-i)-1);s++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
