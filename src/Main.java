import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Fiyat Giriniz:");
        float deger = scanner.nextFloat();

        float sonuc = kdvHesaplayici(deger);
        System.out.println("Girilen Fiyat : " + deger + "\n" + "KDV'li fiyat : " + sonuc);
    }

    private static float kdvHesaplayici(Float deger) {
        float kdv;
        int oran = (deger > 0 && deger <= 1000) ? 18 : 8;

        kdv = (deger / 100) * oran;

        return deger + kdv;
    }
}