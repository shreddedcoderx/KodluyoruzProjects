import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? : ");
        total += armut*scanner.nextInt();

        System.out.println("Elma Kaç Kilo ? : ");
        total += elma * scanner.nextInt();

        System.out.println("Domates Kaç Kilo ? : ");
        total += domates * scanner.nextInt();

        System.out.println("Muz Kaç Kilo ? : ");
        total += muz * scanner.nextInt();

        System.out.println("Patlıcan Kaç Kilo ? : ");
        total += patlican * scanner.nextInt();

        System.out.println("Toplam Tutar : " + total);
    }

}