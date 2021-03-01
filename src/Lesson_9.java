import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson_9 {
    public static void main(String[] args) {
       /* ArrayList<Integer> List=new ArrayList<>();

        List.add(3);
        List.add(4);
        List.add(5);

        int uzunluk=List.size();
        //System.out.println("uzunluk: "+uzunluk);

        //listin elemanlarına nasıl ulasılır.
        int birinci_eleman=List.get(0);
        int ikinci_eleman=List.get(1);
        int ucuncu_eleman=List.get(2);

        for(int i=0; i<List.size(); i++){
            System.out.println((i+1)+".nci eleman "+List.get(i));
        }
        ArrayList<String> stringArrayList=new ArrayList<>();

        stringArrayList.add("Londra");
        stringArrayList.add("New york");
        stringArrayList.add("Tokya");
        stringArrayList.add("Sydney");

        //arrayin uzunlugu
        int uzunluk=stringArrayList.size();



        for(int i=0; i<stringArrayList.size(); i++){
            System.out.println((i+1)+"çnci eleman:"+stringArrayList.get(i));
        ArrayList<String> stringArrayList=new ArrayList<>();

        stringArrayList.add("Londra");
        stringArrayList.add("New york");
        stringArrayList.add("Tokya");
        stringArrayList.add("Sydney");

        //arrayin uzunlugu
        int uzunluk=stringArrayList.size();



        for(int i=0; i<stringArrayList.size(); i++){
            System.out.println((i+1)+"çnci eleman:"+stringArrayList.get(i));
        }

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(4);
        integerArrayList.add(45);
        integerArrayList.add(8);
        integerArrayList.add(234);
        integerArrayList.add(5642);
        integerArrayList.add(1);

        for (int i = 0; i < integerArrayList.size(); i++) {
            if (integerArrayList.get(i) > 100) {
                integerArrayList.remove(i);
                System.out.println(integerArrayList);
            }

        }


        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println((i + 1) + ".nci eleman: " + integerArrayList.get(i));

        }

        ArrayList<Integer> List1=new ArrayList<>();

        List1.add(5);
        List1.add(6);
        List1.add(7);
        List1.add(8);
        List1.add(9);

        List1.add(1,10);
        for (int i = 0; i < List1.size(); i++) {
                System.out.println((i+1)+".nci eleman: "+List1.get(i));
        }

        ArrayList<Integer> Listone= new ArrayList<>();
        Listone.add(10);
        Listone.add(11);
        Listone.add(12);
        Listone.add(13);
        Listone.add(14);

        Listone.set(2,100);
        for (int i = 0; i < Listone.size(); i++) {
            System.out.println((i+1)+".nci eleman: "+Listone.get(i));
        }

        ArrayList<String> Listtwo= new ArrayList<>();

        Listtwo.add("Ahmet");
        Listtwo.add("Adem");
        Listtwo.add("Abdullah");
        Listtwo.add("Ali");
        Listtwo.add("Aydın");

       Listtwo.remove(4);
        for (int i = 0; i < Listtwo.size(); i++) {
            System.out.println((i+1)+".nci eleman: "+Listtwo.get(i));
        }

        ArrayList<Integer> List1=new ArrayList<>();
        ArrayList<Integer> List2=new ArrayList<>();


        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);

        List2.add(5);
        List2.add(6);
        List2.add(7);

        List1.addAll(List2);
        for (int i = 0; i < List1.size(); i++) {
            System.out.println(List1.get(i));
        }

        ArrayList<Integer>  List=new ArrayList<>();
        List.add(100);
        List.add(200);
        List.add(300);
        List.add(400);



    Object[] int_array=List.toArray();
        for (int i = 0; i < int_array.length; i++) {
            System.out.println((i+1)+"n.ci eleman: "+int_array[i]);
        }

        String[] string_array={"for","bar","baz"};

        List<String> stringList= Arrays.asList(string_array);
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println((i+1)+"n.ci eleman: "+stringList.get(i));
        }*/

        int[] int_array={4,5,7,9};

        List<Integer> List= new ArrayList<>(int_array.length);
        for (int i = 0; i < int_array.length; i++) {
            List.add(int_array[i]);
        }
        for (int i = 0; i < List.size(); i++) {
            System.out.println((i+1)+"n.ci eleman: "+List.get(i));
        }



    }
}







