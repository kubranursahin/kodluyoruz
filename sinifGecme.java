import java.util.Scanner;
public class sinifGecme
{
    public static void main(String[] args) {
        double mat,fiz,turk,kim,muz;
        double toplam = 0;
        int count = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextDouble();

        if(0 <= mat && mat<= 100){
            count++;
            toplam += mat;
        }

        System.out.print("Fizik Notunuz : ");
        fiz = inp.nextDouble();

        if(0 <= fiz && fiz<= 100){
            count++;
            toplam += fiz;
        }

        System.out.print("Türkçe Notunuz : ");
        turk = inp.nextDouble();

        if(0 <= turk && turk<= 100){
            count++;
            toplam += turk;
        }

        System.out.print("Kimya Notunuz : ");
        kim = inp.nextDouble();

        if(0 <= kim && kim<= 100){
            count++;
            toplam += kim;
        }

        System.out.print("Müzik Notunuz : ");
        muz = inp.nextDouble();

        if(0 <= muz && muz<= 100){
            count++;
            toplam += muz;
        }

        double avarage = toplam / count ;

        if(avarage <= 55 ) {
            System.out.println("Sınıfta kaldınız.");
        }
        else {
            System.out.println("Tebrikler Sınıfı Geçtiniz");
        }
        System.out.println("Ortalamanız : " +avarage);

    }
}