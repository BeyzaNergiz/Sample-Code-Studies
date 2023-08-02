import java.util.Scanner;

public class Sample_2 {

    public static void main(String[] args) {

        // Soru-2)   SOUT/SYSO
        //Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
        //Ipuclari:
        //* Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
        //* Dikdortgenin Alani : uzun kenar * kisa kenar

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen dikdortgenin uzun kenarini giriniz: ");
        double uzunKenar = scan.nextDouble();
        System.out.println("Lutfen dikdortgenin kisa kenarini giriniz: ");
        double kisaKenar = scan.nextDouble();

        System.out.println("Dikdortgenin cevresi : " + 2 *(uzunKenar+kisaKenar));
        System.out.println("Dikdortgenin alani : " + uzunKenar*kisaKenar);
    }
}
