import java.util.Scanner;

public class siralama {

    public static void main(String[] args)
    {
        int a,b,c;
        Scanner klavye=new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz: ");
        a = klavye.nextInt();
        System.out.println("İkinci sayiyi giriniz: ");
        b = klavye.nextInt();
        System.out.println("Üçüncü sayiyi giriniz: ");
        c = klavye.nextInt();

        if (a >= b){
            if (b >= c)
                System.out.print("Üç sayının sıralaması: " + c + " "+ b + " " + a);

            else if  (c >= a)
                System.out.print("Üç sayının sıralaması: " + b + " "+ a + " " + c);

            else if (a > c)
                System.out.print("Üç sayının sıralaması: " + b + " " + c + " " + a);
        }

        if (b > a){
            if (c >= b)
                System.out.print("Üç sayının sıralaması: " + a + " " + b +" "+ c);
            else if (c >= a)
                System.out.print("Üç sayının sıralaması: " + a + " " + c +" "+ b);
            else if (a > c)
                System.out.print("Üç sayının sıralaması: " + c + " " + a +" "+ b);
        }
    }
}