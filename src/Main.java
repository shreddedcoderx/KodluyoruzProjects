import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName, password, sifirlama, newPassword;
        System.out.print("Kullanıcı Adınız: ");
        userName = scan.nextLine();
        System.out.print("Şifreniz: ");
        password = scan.nextLine();

        if (userName.equals("shreddedcoderx") && password.equals("coder1234")) {
            System.out.print("Başarıyla giriş yaptınız.");
        } else if (!(userName.equals("shreddedcoderx") && password.equalsIgnoreCase(""))) {
            System.out.println("Kullanıcı adınız veya şifreniz hatalı.");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H):");
            sifirlama = scan.nextLine();
            if (sifirlama.equals("H")) {
                System.out.print("Lütfen tekrar giriş yapmak için sayfayı yenileyiniz.");
            } else if (sifirlama.equals("E")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = scan.nextLine();

                while (newPassword.equals("coder1234") || newPassword.equals(password)) {
                    System.out.print("Şifreniz oluşturulamadı. Farklı bir şifre ile tekrar deneyin: ");
                    newPassword = scan.nextLine();
                }
                System.out.print("Şifreniz başarıyla oluşturuldu.\nYeniden Giriş yapabilirsiniz.\nKullanıcı Adınız: ");
                userName = scan.nextLine();
                System.out.print("Şifreniz: ");
                password = scan.nextLine();

                if (userName.equals("shreddedcoderx") && password.equals(newPassword)) {
                    System.out.print("Başarıyla giriş yaptınız.");
                } else {
                    System.out.println("Kullanıcı adınız veya şifreniz hatalı.");
                }
            }
        }
    }
}