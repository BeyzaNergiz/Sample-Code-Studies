import java.util.Scanner;

public class Sample_3 {
    public static void main(String[] args) {
        //Soru 3-)   SCANNER
        //Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        double sayi2 = scan.nextDouble();
        System.out.println("Lutfen ucuncu sayiyi giriniz");
        double sayi3 = scan.nextDouble();
        System.out.println("Lutfen dorduncu sayiyi giriniz");
        double sayi4 = scan.nextDouble();
        System.out.println("Lutfen besinci sayiyi giriniz");
        double sayi5 = scan.nextDouble();
        double ortalama = (sayi1 + sayi2 + sayi3 + sayi4 + sayi5) / 5;
        System.out.println("Girilen bes sayinin ortalamasi : " + ortalama);
    }

}
