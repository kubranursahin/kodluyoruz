import java.util.Scanner;

public class kdvHesabi {
    public static void main(String[] args)
    {
        double tutar, kdvOran;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürün fiyatı  : ");
        tutar=scanner.nextDouble();

        if (tutar>=0 && tutar<=1000){
            kdvOran=0.18;
            double kdvTutar=tutar*kdvOran;   //Fiyata eklenecek olan kdv miktarı.
            double kdvliTutar=tutar+kdvTutar; //Fiyatın kdv eklenmiş güncel tutarı.
            System.out.println("%18 kdv ile yeni fiyat  : " + kdvliTutar +"  dır. ");

        }
        else if (tutar>1000)
        {
            kdvOran =0.8;
            double kdvTutar=tutar*kdvOran;   //Fiyata eklenecek olan kdv miktarı.
            double kdvliTutar=tutar+kdvTutar; //Fiyatın kdv eklenmiş güncel tutarı.
            System.out.println("%8 kdv ile yeni fiyat   : " +kdvliTutar+"dır.");
        }
        else
        {
            //Negatif değer girildiğinde kullanıcıya uyarı verir.
            System.out.println("Lütfen geçerli bir fiyat değeri girin...");
        }
    }
}
