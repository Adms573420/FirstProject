import java.util.Scanner;

public class Lesson_7 {
    /*public static void main(String args[]){
       int sayı=2;

       switch (sayı){
           case 1:
               System.out.println("sayı:"+1*2);
               break;
           case 2:
               System.out.println("sayı:"+2*2);
               break;
           case 3:
               System.out.println("sayı:"+3*2);
               break;
           default:
               System.out.println("sayı:"+4*2);
       }

       }
       public static void main(String args[])

       {int not1,not2,not3,not4;


           System.out.println("ögrenci numarasını giriniz");
           Scanner scanner=new Scanner(System.in);
           int not= scanner.nextInt();



           switch (not){
               case 321:
                   System.out.println(98);
                   break;
                   case 213:
                   System.out.println(87);
                   break;
                   case 354:
                   System.out.println(99);
                   break;
                   case 124:
                   System.out.println(100);
                   break;
                   case 150:
                   System.out.println(92);
                   break;
               default:
                   System.out.println("not bulunamadı");
           }






       }
    public static void main(String[] args) {
        System.out.println("sehir ismi giriniz");
        Scanner scanner=new Scanner(System.in);
        String sehir= scanner.next();



        switch (sehir) {
            case "istanbul":
                System.out.println("plaka no:"34);
                break;
            case "Ankara":
                System.out.println("plaka no:"06);
                break;
            case "Antalya":
                System.out.println("plaka no:07);
                break;
            case "Bursa":
                System.out.println("plaka no:"16);
                break;
            case "Bitlis":
                System.out.println("plaka no:"13);
                break;
            default:
                System.out.println("Sehir bulunamadı");

        }

    }*/
    public static void main(String[] args) {
        double birinci_sayı, ikinci_sayı;
        double result = 0.0;
        System.out.println("birinci sayıyı giriniz:");
        System.out.println("ikinci sayıyı giriniz:");
        Scanner scanner = new Scanner(System.in);

        birinci_sayı = scanner.nextDouble();
        ikinci_sayı = scanner.nextDouble();

        System.out.println("+,-,*,/ secilen islemlerden birini seciniz:");
        String secilen_aritmetik_islem = scanner.next();

        switch (secilen_aritmetik_islem) {
            case "+":
                result = birinci_sayı + ikinci_sayı;
                break;
            case "-":
                result = birinci_sayı - ikinci_sayı;
                break;
            case "*":
                result = birinci_sayı * ikinci_sayı;
                break;
            case "/":
                result = birinci_sayı / ikinci_sayı;
                break;
        }

        System.out.println("Secilen aritmetik islem:" + secilen_aritmetik_islem);
        System.out.println("Sonuc:" + result);
        int int_result=(int) result;
        System.out.println("int_result:"+int_result);

    }


}





