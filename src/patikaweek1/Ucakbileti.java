package patikaweek1;
import java.util.Scanner;
public class Ucakbileti {
    public static void main(String[] args) {
        int km = 0;
        int age = 0;
        int yolculuktip = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş) : " );
        yolculuktip = input.nextInt();

        if(km>0 && age>0 && (yolculuktip==1 || yolculuktip==2)) {
            double normalTutar = km*0.10;
            double yasIndirimOrani = 0;


            if (age<12){
                yasIndirimOrani = 0.50;
            }else if (age>=12 && age<=24) {
                yasIndirimOrani = 0.10;
            }else if (age>65){
                yasIndirimOrani = 0.30;
            }

            normalTutar -= (normalTutar*yasIndirimOrani);


            if (yolculuktip == 2) {
                normalTutar -= (normalTutar*0.20);
                normalTutar *= 2;
            }
            System.out.println("Toplam tutar = " + normalTutar);
        }else{
            System.out.println("Hatalı veri girdiniz: ");


        }






    }
}
