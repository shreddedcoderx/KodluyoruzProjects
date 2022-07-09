import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik: ");
        mat = input.nextInt();
        System.out.print("Fizik: ");
        fizik = input.nextInt();
        System.out.print("Kimya: ");
        kimya = input.nextInt();
        System.out.print("Turkce: ");
        turkce = input.nextInt();
        System.out.print("Tarih: ");
        tarih = input.nextInt();
        System.out.print("Müzik: ");
        muzik = input.nextInt();

        int result = ortalama(mat, fizik, kimya, turkce, tarih, muzik);

        System.out.println(result > 60 ? "Geçtiniz" : "Kaldınız");
    }

    private static int ortalama(int mat, int fizik, int kimya, int turkce, int tarih, int muzik) {
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        return toplam / 6;
    }
}