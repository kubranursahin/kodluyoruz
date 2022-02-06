import java.util.Scanner;
public class ciftSayi
{
    public static void main(String[] args) {
        int k, sayac=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı giriniz  :" );
        k=scanner.nextInt();
        double count=0;
        for(int i = 0; i <= k; i++)
        {
            if(i % 3==0 && i% 4==0)
            {
                sayac=sayac+i;
                count++;
            }
        }
        double ortalama = sayac/count;
        System.out.println("Sonuc :" + ortalama);
    }
}
