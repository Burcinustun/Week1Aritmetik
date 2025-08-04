package patikaweek1;
import java.util.Scanner;
public class VucutKitle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy= scan.nextDouble();
        System.out.print("Lütfen kikonuzu giriniz : ");
        double kilo = scan.nextDouble();
        double index = kilo/(boy*boy);
        System.out.println("vücut Kitle İndeksiniz : "  + index);


    }
}
