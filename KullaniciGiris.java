import java.util.Scanner;

public class KullaniciGiris{

    public static void main(String[] args) {
        {

            String userName, password, newPassword;
            int select;

            Scanner input = new Scanner(System.in);
            Scanner pw = new Scanner(System.in);

            System.out.print("Kullanici Adınız  : ");
            userName = input.nextLine();
            System.out.print("Şifreniz  : ");
            password = input.nextLine();
            if (userName.equals("kullanici") && password.equals("kullanici1")) {
                System.out.println("Giriş Başarılı");
            } else {
                System.out.println("Giriş Bilgilerinizi Kontrol Edip Tekrar Deneyiniz!");
                System.out.println("Şifrenizi Değiştirmek İstermisiniz? \n 1-Evet\n 2-Hayir");
                select = input.nextInt();
                if (select == 1) {
                    System.out.print("Yeni şifreni giriniz: ");
                    newPassword = pw.nextLine();

                    if (newPassword.equals("admin1212")) {
                        System.out.println("Girdiğiniz şifre bir önceki şifreniz ile aynı olamaz. ");
                    } else {
                        System.out.println("Şifreniz başarılı bir şekilde değiştirildi.");
                    }
                } else {
                    System.out.println("Şifre değiştirme talebi reddedildi.");
                }
            }
        }
    }
}