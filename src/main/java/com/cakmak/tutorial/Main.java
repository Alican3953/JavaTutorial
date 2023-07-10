package com.cakmak.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("istediğiniz sayıyı giriniz = ");
        int sayi = Scanner.nextInt();
        int yildiz = 1;
        int tempBosluk = 1;
        int bosluk = 0;
        System.out.println("işlem başlyor ");
        if (sayi % 2 == 1) {
            bosluk = (sayi - 1) / 2;
            for (int i = 1; i <= sayi; i++) {
                if (bosluk >= 0) {
                    for (int j = 0; j < bosluk; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < yildiz; j++) {
                        System.out.print("*");
                    }
                    bosluk--;//bosluk=bosluk-1;
                    if (bosluk >= 0)
                        yildiz += 2;//yildiz=yildiz+2;
                    System.out.println();
                    //alt kısım için burası
                } else  {
                    yildiz-=2;
                    //System.out.println("yıldız: " + yildiz + ", bosluk: " + bosluk);
                    for (int j = 0; j < tempBosluk; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < yildiz; j++) {
                        System.out.print("*");
                    }
                    tempBosluk++;
                    System.out.println();
                }
            }
        }else {
            System.out.println("lütfen tek sayı giriniz");
        }
    }
}







































//        int bosluk = 0 ;
//        int yildiz = 1 ;
//        int tmpBosluk = 1;
//        if(sayi%2 == 1){
//            bosluk = (sayi-1)/2;
//            for (int i = 0; i < sayi; i++) {
//                if (bosluk>=0) {
//                    for (int j = 0; j < bosluk; j++) {
//                        System.out.print(" ");
//                    }
//                    for (int j = 0; j < yildiz; j++) {
//                        System.out.print("*");
//                    }
//                    bosluk--;
//                    if (bosluk>=0) {
//                        yildiz += 2;
//                    }
//                    System.out.println();
//                } else  {
//                    yildiz-=2;
//                    for (int j = 0; j < tmpBosluk; j++) {
//                        System.out.print(" ");
//                    }
//                    for (int j = 0; j < yildiz; j++) {
//                        System.out.print("*");
//                    }
//                    tmpBosluk++;
//                    System.out.println();
//                }
//            }
//        }
//        else {
//            System.out.println("hata lütfen tek sayı giriniz");
//        }

/* dayı mikailnki
        for (int i = sayi; 0 < i; i--) {

            for (int j = sayi; 0 < j; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }*/
     /* bu reditz
        Scanner klavye=new Scanner(System.in);
        System.out.println("yükseklik kaç satır olsun?");
        int yukseklik=klavye.nextInt(); //yükseklik hep tek sayi olacaktir
        int yariyukseklik=(int)(yukseklik/2)+1;

        for(int i=1;i<=yariyukseklik;i++)
        {
            for(int j=1;j<=yariyukseklik-i;j++)
                System.out.print(" ");

            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");

            System.out.println();
        }
        //üst yarısı tamam
        for(int i=yariyukseklik-1;i>=1;i--)
        {
            for(int j=1;j<=yariyukseklik-i;j++)
                System.out.print(" ");

            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");

            System.out.println();
        }

    }
}
*/
/** bu chat gpt nin kodu
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Desen için bir sayı girin: ");
        int n = scanner.nextInt();
/**java doc için bir yorum satırı


        for (int row = -n; row <= n; row++) {
            for (int col = -n; col <= n; col++) {
                if (Math.abs(row) + Math.abs(col) <= n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

**/
/* buda blackkodun kodu
import java.util.Scanner;
public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Desen için bir sayı girin: ");
        int n = scanner.nextInt();
        int row, col, space;
        for (row = 1; row <= n; row++) {
            for (space = 1; space <= n - row; space++) {
                System.out.print("   ");
            }
            for (col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        for (row = n - 1; row >= 1; row--) {
            for (space = 1; space <= n - row; space++) {
                System.out.print("   ");
            }
            for (col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

*/























