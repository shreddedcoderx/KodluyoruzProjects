import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float mesafe;
        double perKm= 2.20, sonuc;
        int acilis = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gideceğiniz KM'yi yazınız: " );
        mesafe = scanner.nextFloat();
        sonuc = (mesafe * perKm) + acilis;

        sonuc = sonuc < 20 ? 20 : sonuc;

        System.out.println("Ödeyeceğiniz Tutar : " + sonuc);
    }
}