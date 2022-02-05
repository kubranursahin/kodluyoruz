import java.util.Scanner;
/*Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
*/
public class manavKasa
{
    public static void main (String[] args)
    {
        double fiyatArmut=2.14, fiyatElma=3.67, fiyatDomates=1.11, fiyatMuz=0.95, fiyatPatlican=5.00,toplamFiyat, armut, elma, domates, muz, patlican;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç kilo armut ? :");
        armut= scanner.nextDouble();
        System.out.println("Kaç kilo elma ? :");
        elma = scanner.nextDouble();
        System.out.println("Kaç kilo domates ? :");
        domates=scanner.nextDouble();
        System.out.println("Kaç kilo patlıcan ? :");
        patlican= scanner.nextDouble();
        System.out.println("Kaç kilo muz? :");
        muz = scanner.nextDouble();
        toplamFiyat=(armut*fiyatArmut+elma*fiyatElma*domates*fiyatDomates+muz*fiyatMuz*patlican*fiyatPatlican);
        System.out.println("Toplam Fiyat  :" + toplamFiyat);


    }
}
