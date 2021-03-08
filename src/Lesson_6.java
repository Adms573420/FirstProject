import java.util.Scanner;

public class Lesson_6
{
    /*public static void main(String[] args)
    {
        int sayı=5;
        for(int i=0; i<=sayı; i++){
            System.out.println("i:"+i);
        }


    }
    public static void main(String[] args) {
        int sayı=10;
         for(int i=15; i>sayı; i--){
             System.out.println("i:"+i);
         }
    }
    public static void main (String[]args){
        String name= "Mehmet";

        for(int i=0; i<name.length(); i++){
            System.out.println(i +".ci sıradali indeks "+ name.charAt(i));
        }
    }
    public static void main(String[] args) {
        int sum=0;

        for(int i=1; i<=10; i++){
            sum+=i;

        }
        System.out.println("toplam:"+sum);
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            System.out.println("i:"+i);
            if(i==10){
                break;
            }
        }
    }
    public static void main(String[] args) {
      for(int i=0; i<100; i++){
          if(i<4){
              continue;
          }
          System.out.println("i:"+i);
      }

    }
    public static void main(String[] args) {
        int girilen_sayı;

        System.out.println("Bir sayı giriniz:");
        Scanner scanner = new Scanner(System.in);
         girilen_sayı = scanner.nextInt();

        int carpım=1;

        for(int i=1;i<=girilen_sayı; i++){
            carpım *=i;
        }
        System.out.println("faktöriyel sonucu:"+carpım);
 }
    public static void main(String[] args) {
        int girilen_sayı;

        System.out.println("Bir sayı giriniz:");
        Scanner scanner = new Scanner(System.in);
        girilen_sayı = scanner.nextInt();

        boolean asal_mı =true;


        for(int sayı=2; sayı<girilen_sayı; sayı++){
            if(girilen_sayı %sayı ==0){
                System.out.println("asal sayı degildir");
                asal_mı= false;
                break;
            }
        }
        if(asal_mı){
            System.out.println("asal sayıdır:");
        }


    }
    public static void main(String[] args) {
        String str;
        System.out.println("Bir string giriniz:");
        Scanner scanner = new Scanner(System.in);
        str =scanner.next();

        for(int sayı=str.length()-1; sayı>=0; sayı--){
            System.out.print(str.charAt(sayı));
        }
    }
    public static void main(String[] args) {
        int girilen_sayı;

        System.out.println("Bir sayı giriniz:");
        Scanner scanner = new Scanner(System.in);
        girilen_sayı = scanner.nextInt();

        for(int sayı=1; sayı<=girilen_sayı; sayı++){
            if(girilen_sayı %sayı == 0){
                System.out.println(sayı+" sayısı "+girilen_sayı+" nin bir bölenidir.");
            }
        }



    }
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String str;
        System.out.println("Bir string giriniz:");
        Scanner scanner = new Scanner(System.in);
        str =scanner.next();

        for(int i=0; i<=str.length()-1; i++){
            if(Character.toString(str.charAt(i)) .equals("a")){
                StringBuilder myName = new StringBuilder(str);
                myName.setCharAt(i,' ');
                str=myName.toString();
            }
        }
        System.out.println("str:"+str);

 }*/
    public static void main(String[] args) {

    System.out.println("Bir isim giriniz:");
    Scanner scanner=new Scanner(System.in);
    String metin =scanner.nextLine();

   String cevrilen=cevir(metin);

   System.out.println(cevrilen);
    }
    public static String cevir(String metin )
    {
     if(metin.isEmpty())
      return metin;
     return cevir(metin.substring(1)+metin.charAt(0));
    }






    }









