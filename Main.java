//public class Main {

    //public static void main(String[] args) {

       // System.out.println("hellow"); //wyswietl element
       // int a,b;
       // float c=2.0F;
       // double D=3.43434343;
       // boolean pytanie = true;
       // String imie;
        //int wiek;

   // }

//}
//public class Main {
   // public static void main(String[] args) {
       // String imie = "jan", maisto = "Rzesow";
       // int wiek=34;
       // System.out.println("Imie: "+imie+"miasto: "+maisto+"wiek: "+wiek);

   // }
//}

//import java.util.Scanner;

//public class Main {
    //public static void main(String[] args) {
       // String imie, miasto;
      //  int wiek;
        //wczytywanie danych z klawiatury
       // Scanner input = new Scanner(System.in);
       // System.out.println("Podaj wiek");
      //  wiek = input.nextInt();
       // System.out.println("Podaj imie");
       // imie = input.next();
       // int a=3;
       // a*=100;
      //  a++;++a;

      //  if (warunek){
//
       // }
       // else if (){

      //  }else;
       // switch (warunek){
       //     case 1:
                //instrukcja
             //   break;
      //  }


import java.util.Scanner;

//  }
    public class Main {
    private static Random Random;

    public static void main(String[] args ){
        // wywolanie metod
        System.out.println(getMyName());
        System.out.println(getMyAge());
        obliczenia(1,2);
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("podaj a i b: ");
        a= in.nextInt();
        b=in.nextInt();
        obliczenia (a,b);
        System.out.println(Math.pow(2.0,3.0));
        Random = new Random(); 
        
    }
    //metody
        public static String getMyName(){
        return  "jan";
        }
        public static  int getMyAge(){
        return 23;
        }
        public static void obliczenia (int l1, int l2){
        System.out.println(l1+"+"+l2+"="+(l1+l2));
            int i = l1 - l2;
            System.out.println(l1+"-"+l2+'='+(l1-l2));
        }
}

package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a:");
        int a, b, c;
        a = scanner.nextInt();
        System.out.println("Podaj b:");
        b = scanner.nextInt();

        Main main = new Main();
        int liczba1 = main.losuj(a, b);
        System.out.println("Liczba: " + liczba1);
        System.out.println("Czy parzysta: " + main.czyParzysta(liczba1));
        int liczba2 = main.losuj(a, b);
        System.out.println("Liczba: " + liczba2);
        System.out.println("Czy podzielna przez 3 i 5: " + main.czyPodzielna(liczba2));
        int liczba3 = main.losuj(a, b);
        System.out.println("Liczba: " + liczba3);
        System.out.println("Trzecia potęga: " + main.doTrzeciej(liczba3));
        int liczba4 = main.losuj(a, b);
        System.out.println("Liczba: " + liczba4);
        System.out.println("Pierwiastek: " + main.pierwiastek(liczba4));
        int liczba5 = main.losuj(a, b);
        int liczba6 = main.losuj(a, b);
        int liczba7 = main.losuj(a, b);
        System.out.println("Wylosowane liczby: " + liczba5 + ", " + liczba6 + ", " + liczba7);
        System.out.println("Czy można zbudować trójkąt prostokątny: " + main.czyTrojkatProstokatny(liczba5, liczba6, liczba7));
    }

    public boolean czyParzysta(int liczba) {
        return liczba % 2 == 0;
    }

    public boolean czyPodzielna(int liczba) {
        return liczba % 3 == 0 && liczba % 5 == 0;
    }

    public int doTrzeciej(int liczba) {
        return liczba * liczba * liczba;
    }

    public double pierwiastek(int liczba) {
        return Math.sqrt(liczba);
    }

    public boolean czyTrojkatProstokatny(int a, int b, int c) {
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (c * c + b * b == a * a);
    }
    
    private int losuj(int a, int b) {
        Random r = new Random();
        return r.nextInt(b - a) + a;
    }
}


