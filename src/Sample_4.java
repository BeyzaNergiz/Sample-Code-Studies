import java.util.Scanner;

public class Sample_4 {
    public static void main(String[] args) {


        // Soru 4-)   SCANNER
        //            Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");

        double sayi = scanner.nextDouble();

        double yeniSayi = (sayi*sayi*sayi)/2;
        System.out.println("Girilen sayinin küpünün yarisi : " + yeniSayi);

    }

}
