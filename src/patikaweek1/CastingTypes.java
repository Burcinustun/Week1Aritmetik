package patikaweek1;

import java.util.Scanner;

public class CastingTypes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a decimal number: "); // user can enter a decimal number
        double NumberDouble = input.nextDouble();

        System.out.println("Please enter an integer number: ");
        int NumberInt = input.nextInt();

        int FirstCasting = (int) NumberDouble; // Explicit Casting: double to Integer
        System.out.println("Double to Integer: " + FirstCasting);

        double SecondCasting = (double) NumberInt; // Auto Widenning: Integer to Double
        System.out.println("Integer to Double: " + SecondCasting);

    }
}
