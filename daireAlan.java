import java.util.Scanner;
public class daireAlan
{
    //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan program.
    public static void main(String[] args)
    {
        int r;
        double pi=3.14;
        double a;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Yarıçapı girin  :");
        r= scanner.nextInt();     // Kullanıcıdan yarıçap istendi.
        System.out.println("Derece cinsinden açıyı girin  :");
        a= scanner.nextDouble();   //Alanı bulunacak dilimin açısı istendi.
        double dilimAlan=pi*r*r*a/360;  //Dilim alanı formulu
    System.out.println("Girilen açının alanı :" + dilimAlan);
    }
}
