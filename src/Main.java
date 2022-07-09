import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float mesafe;
        double perKm= 2.20, sonuc;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gideceğiniz KM'yi yazınız: " );
        mesafe = scanner.nextFloat();

        sonuc = (mesafe*perKm) + 10 <= 20 ? 20.0 : fiyatHesapla(mesafe, perKm);

        System.out.println("Ödeyeceğiniz Tutar : " + sonuc);
    }

    private static double fiyatHesapla(float mesafe, double perKm) {
        return 10 + (mesafe * perKm);

    }
}