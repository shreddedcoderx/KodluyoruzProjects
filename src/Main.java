import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        double hipotenus, alan;

        System.out.println("Üçgenin A kenarını girin:");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        System.out.println("Üçgenin B kenarını girin:");
        b = scanner.nextInt();

        hipotenus = hipotenusHesapla(a, b);
        System.out.println("Hipotenüs : " + hipotenus);

        alan = ucgenAlan(a, b, hipotenus);
        System.out.println("Üçgenin alanı : " + alan);

        scanner.close();
    }

    private static double ucgenAlan(int a, int b, double hipotenus) {
        double cevre = ( a + b + hipotenus) / 2;

        return Math.sqrt(cevre * (cevre - a) * (cevre - b) * (cevre - hipotenus));

    }

    private static double hipotenusHesapla(int a, int b) {
        return Math.sqrt((a*a) + (b*b));
    }
}