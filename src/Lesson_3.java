import java.util.Scanner;

public class Lesson_3 {

   /* public static void main(String args[]) {

        int ali = 45;
        int veli = 65;
        int ayse = 60;

        int x = (ali < 50) ? ali + 20 : ali + 30;
        int y = (veli < 50) ? veli + 20 : veli + 30;
        int z = (ayse < 50) ? ayse + 20 : ayse + 30;

        System.out.println("alinin yeni notu:" + x);
        System.out.println("Velinin yeni notu:" + y);
        System.out.println("Ayseninin yeni notu:" + z);

    }
   public static void main(String[] args)
   {
      Scanner maas = new Scanner(System.in);

      System.out.print("Enter your old salary:");

      double salary = maas .nextDouble();

      double new_salary= salary*1.2 ;

      System.out.print("yeni maasınız:"+new_salary);

 }*/
    public static void main(String args[])
    {
        Scanner data = new Scanner(System.in);

        System.out.print("Yaşınızı giriniz:");
        int yas = data.nextInt();

        System.out.print("Maasınızı giriniz:");
        double maas = data .nextInt();

        double yeni_maas= (yas>40)? maas*1.15 : maas*1.3;

        System.out.println("Yeni maasınız:"+yeni_maas);



    }

}
