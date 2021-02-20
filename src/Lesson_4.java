import java.util.Locale;

public class Lesson_4 {

    /* public static void main(String[] args)
     {
       String name = "Ali bu-gün JAV-A calıstı";

       String remove = name.replace("-","");

       System.out.println(remove);
     }

     public static void main (String[] args){

         String name = "merh.b.l.r";

         String name_replace = name.replace(".","a");

         System.out.println(name_replace);
     }

     public static void main (String[] args)
     {
         String name = "JAVA KURSU";

         String name_lower= name.toLowerCase(Locale.ROOT);
         String name_upper= name.toUpperCase(Locale.ROOT);
         int name_legnth=name.length();

         System.out.println(name_lower);
         System.out.println(name_upper);
         System.out.println(name_legnth);

     }

     /*public static void main (String[] args){

         String name = "JAVA Kursu";
         int name_index = name.indexOf("r");

         System.out.println(name_index);
    }

     public static void main (String[] args){

         String name1 ="HELLO";
         String name2 ="hello";

         boolean name_equal = name1.equals(name2);

         System.out.println(name_equal);
     }*/
    public static void main(String[] args) {

       /* String name= "Elma,Armut,Ceviz";

        boolean contains = name.contains("a");

        System.out.println(contains);*/

        String name1 = "Elma";
        String name2 = "Armut";
        String name3 = "Ceviz";

        boolean con_1 = name1.contains("a");
        boolean con_2 = name2.contains("a");
        boolean con_3 = name3.contains("a");

        System.out.println(con_1);
        System.out.println(con_2);
        System.out.println(con_3);


    }

}




