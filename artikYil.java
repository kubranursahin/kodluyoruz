import java.util.Scanner;
public class artikYil
{
    public static void main(String[] args)
    {
        int year=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yılı giriniz   : ");
        year=scanner.nextInt();
        double artik = year%4;
     if(artik==0){
            System.out.println(year + ":   Bir artık yıldır.");
        }
     else{
         System.out.println(year + ":   Bir artık yıl değildir. ");
     }
    }
}
