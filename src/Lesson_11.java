import java.util.HashMap;
import java.util.Map;

public class Lesson_11 {
    public static void main(String[] args) {
      /*    HashMap<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "Pazartesi");
        myMap.put(2, "Salı");
        myMap.put(3, "Carsamba");
        myMap.put(4, "Persembe");
        myMap.put(5, "Cuma");
        myMap.put(6, "Cumartesi");
        myMap.put(7, "Pazar");

      boolean bir_iceriyormu=myMap.containsKey(1);
        boolean sekiz_iceriyormu=myMap.containsKey(8);

        System.out.println("bir iceriyor mu:"+bir_iceriyormu);
        System.out.println("sekiz iceriyor mu:"+sekiz_iceriyormu);

        boolean salı_iceriyormu= myMap.containsValue("Salı");
        boolean hafta_iceriyormu= myMap.containsValue("Hafta");

        System.out.println("salı iceriyor mu:"+salı_iceriyormu);
        System.out.println("hafta iceriyor mu:"+hafta_iceriyormu);

        //key=4 olan entry i kaldıralım
        myMap.remove(4);
        System.out.println(myMap);

        myMap.remove(2,"Salı");
        System.out.println(myMap);

        myMap.replace(2,"SALI");
        System.out.println(myMap);

        for (Integer key:myMap.keySet()
             ) {
            System.out.println(key);
        for (String value:myMap.values()
             ) {
            System.out.println(value);

        }
        for (Map.Entry mapElemanı:myMap.entrySet()
             ) {
            System.out.print(mapElemanı.getKey()+":");
            System.out.print(mapElemanı.getValue());
        }*/
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("tr", "Turkısh");
        myMap.put("en", "England");
        myMap.put("de", "German");
        myMap.put("ar", "Arabic");

        boolean tr_varmı = myMap.containsKey("tr");
        boolean es_varmı = myMap.containsKey("es");
        System.out.println(tr_varmı);
        System.out.println(es_varmı);

        for (String key : myMap.keySet()
        ) {
            System.out.println(key);
        }
        for (String value : myMap.values()
        )
        {
            System.out.println(value);
        }




    }


}

