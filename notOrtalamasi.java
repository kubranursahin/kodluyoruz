import java.util.Scanner;
public class notOrtalamasi
{
    public static void main(String[] args)
    {

        int matematik, fizik,kimya,turkce,tarih,muzik;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Matematik Sınav Notunu Giriniz   : ");
        matematik= scanner.nextInt();

        System.out.println("Fizik Sınav Notunu Giriniz   : ");
        fizik=scanner.nextInt();

        System.out.println("Kimya Sınav Notunu Giriniz   : ");
        kimya=scanner.nextInt();

        System.out.println("Türkçe Sınav Notunu Giriniz   : ");
        turkce=scanner.nextInt();

        System.out.println("Tarih Sınav Notunu Giriniz   : ");
        tarih=scanner.nextInt();

        System.out.println("Müzik Sınav Notunu Giriniz   : ");
        muzik=scanner.nextInt();

        double ortalama=(matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Derslerin not ortalaması    : " + ortalama);
    }
}
