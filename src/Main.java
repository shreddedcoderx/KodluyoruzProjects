import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        double boy, kilo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz; ");
        boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz; ");
        kilo = scanner.nextDouble();

        double result = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + df.format(result));
    }
}