import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;
        double alan, cevre, daireDilimAlani, aci;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz : ");
        r = scanner.nextInt();

        System.out.println("Açıyı giriniz: ");
        aci = scanner.nextDouble();

//        alan = pi * r * r;
//        cevre = 2 * pi * r;
        daireDilimAlani = (pi * (r*r)*aci) / 360;

        System.out.println(aci + " açılı daire diliminin alanı: " + daireDilimAlani);

    }
}