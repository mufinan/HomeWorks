package Week1;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password ;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı adınız: ");
        userName = inp.nextLine();

        System.out.println("Şifreniz:");
        password = inp.nextLine();

        if (userName.equals("mufinan") && password.equals("123456")) {
            System.out.println("Başarıyla giriş yaptınız.");
        } else {
            System.out.println("Girilen bilgiler yanlış! Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır)");
            String resetChoice = inp.nextLine();
            if (!resetChoice.equals("Evet")) {
                System.out.println("Yeni şifrenizi giriniz:");
                String newPassword = inp.nextLine();

                if (newPassword.equals(password)) {
                    System.out.println("Hata! Yeni şifreniz, eski şifrenizle aynı olamaz. Lütfen başka bir şifre giriniz.");

                } else {
                    System.out.println("Hata! Yeni şifreniz, eski şifrenizle aynı olamaz. Lütfen başka bir şifre giriniz.");
                    String yeniParola = inp.nextLine();
                    System.out.println("Şifreniz başarıyla değiştirildi.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }



    }
}
}