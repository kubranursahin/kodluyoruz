import java.util.Scanner;
public class vkiHesabi
{
   /* Java ile kullanıcıdan boy ve kilo değerlerini
    alıp bir değişkene atayın. Aşağıdaki formüle
    göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Formül
    Kilo (kg) / Boy(m) * Boy(m)
    Çıktısı
    Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
    Lütfen kilonuzu giriniz : 105
    Vücut Kitle İndeksiniz : 35.49215792320173
    */
    public static void main(String[] args)
{
    double boy, kilo, vki;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
    boy = scanner.nextDouble();
    System.out.println("Lütfen kilonuzu giriniz  :");
    kilo = scanner.nextDouble();
    vki = kilo/(boy*boy);
    System.out.println("Vücut Kitle İndeksiniz :" + vki);

}
}
