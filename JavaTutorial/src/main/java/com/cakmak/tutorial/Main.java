package com.cakmak.tutorial;
import java.util.Scanner;
/* ilk hali
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


*/
/*
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
                } else {
                    yildiz -= 2;
                    //System.out.println("yıldız: " + yildiz + ", bosluk: " + bosluk);
                    for (int j = 0; j < tempBosluk; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < yildiz; j++) {
                        System.out.print("*");
                    }
                    //yapılan değişiklik satırı


                    tempBosluk++;
                    System.out.println();
                }

            }
        }else{
                System.out.println("lütfen tek sayı giriniz");
            }
        }
    }





//burada kullanacğım yıldız sayısı maximum 2 minimum 1 ama bunu nerede ve nasıl kullanacağımı öğrenmem lazım

*/

public class Main {

    public static void selamlama() {
        System.out.println("ksjksjskj");
        System.out.println("adınız ne ");
    }

         public static void main(String[] args) {



    }

}




