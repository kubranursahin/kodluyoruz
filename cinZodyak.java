import java.util.Scanner;
public class cinZodyak
{/*


    Doğum Tarihi %12 = 5 ➜ Öküz
    Doğum Tarihi %12 = 6 ➜ Kaplan
    Doğum Tarihi %12 = 7 ➜ Tavşan
    Doğum Tarihi %12 = 8 ➜ Ejderha
    Doğum Tarihi %12 = 9 ➜ Yılan
    Doğum Tarihi %12 = 10 ➜ At
    Doğum Tarihi %12 = 11 ➜ Koyun
 */
    public static void main(String[] args)
    {
        int year=0,zodiac;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz. ");
        year=scanner.nextInt();
        zodiac=year % 12;
        switch (zodiac){
            case 0:
                System.out.println("Çin Zodyak Burcunuz Maymun. ");
                break;
            case 1:
                System.out.println("Çin Zodyak Burcunuz Horoz.");
                break;
            case 2:
                System.out.println("Çin Zodyak Burcunuz Köpek.");
                break;
            case 3:
                System.out.println("Çin Zodyak Burcunuz Domuz.");
                break;
            case 4:
                System.out.println("Çin Zodyak Burcunuz Fare");
                break;
            case 5:
                System.out.println("Çin Zodyak Burcunuz Öküz.");
                break;
            case 6:
                System.out.println("Çin Zodyak Burcunuz Kaplan. ");
                break;
            case 7:
                System.out.println("Çin Zodyak Burcunuz Tavşan.");
                break;
            case 8:
                System.out.println("Çin Zodyak Burcunuz Ejderha. ");
                break;
            case 9:
                System.out.println("Çin Zodyak Burcunuz Yılan. ");
                break;
            case 10:
                System.out.println("Çin Zodyak Burcunuz At. ");
                break;
            case 11:
                System.out.println("Çin Zodyak Burcunuz Koyun. ");
                break;
        }

    }
}
