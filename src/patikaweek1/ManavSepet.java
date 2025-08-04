package patikaweek1;
import java.util.Scanner;

public class ManavSepet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz = 0.95;
        double Patlican = 5.00;
        System.out.print("Armut kaç kilo ? : " );
        double ArmutKg = scan.nextDouble();
        System.out.print("Elma kaç kilo ? : " );
        double ElmaKg = scan.nextDouble();
        System.out.print("Domates kaç kilo ? : " );
        double DomatesKg = scan.nextDouble();
        System.out.print("Muz kaç kilo ? : " );
        double MuzKg = scan.nextDouble();
        System.out.print("Patlican kaç kilo ? : " );
        double PatlicanKg = scan.nextDouble();
        double toplamtutar = (ArmutKg*Armut) + (ElmaKg*Elma) + (DomatesKg*Domates) + (MuzKg*Muz) + (PatlicanKg*Patlican);
        System.out.print("Toplam Tutar : " + toplamtutar);


    }
}
