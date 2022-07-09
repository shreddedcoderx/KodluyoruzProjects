import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1, n2, secim, sonuc;


        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        secim = scanner.nextInt();

        switch (secim) {
            case 1:
                sonuc = n1 + n2;
                System.out.println("İşlemin sonucu : " + sonuc);
                break;
            case 2:
                sonuc = n1 - n2;
                System.out.println("İşlemin sonucu : " + sonuc);
                break;
            case 3:
                sonuc = n1 * n2;
                System.out.println("İşlemin sonucu : " + sonuc);
                break;
            case 4:
                if (n2 != 0){
                    sonuc = n1 / n2;
                    System.out.println("İşlemin sonucu : " + sonuc);
                } else {
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                break;


            default:
                System.out.println("Yanlış seçim yaptınız. Lütfen tekrar deneyiniz.");

        }

    }

}