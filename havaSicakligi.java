import java.util.Scanner;

public class havaSicakligi
{
    public static void main(String[] args)
    {
        double sicaklik;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklığı derece cinsinden giriniz :");
        sicaklik=scanner.nextDouble();
        if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if (sicaklik>=5 && sicaklik<=15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if (sicaklik>=15 && sicaklik<=25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else if (sicaklik>25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
        else  {
            System.out.println("Lütfen geçerli bir değer giriniz.");
        }
    }
}
