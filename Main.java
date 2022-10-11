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


