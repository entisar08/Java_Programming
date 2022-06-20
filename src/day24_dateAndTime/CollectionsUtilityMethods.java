package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {
        System.out.println("======================replaceAll Method+================================");
        ArrayList<String> names= new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java","Swift","Python","C#","Ruby","C#","Swift","Java"));
        System.out.println(names);
//replace Java by Python the for loop is one way
       /* for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("Java")){
                names.set(i,"Python");
            }
        }
        System.out.println(names); but there is another way without the loop*/
        Collections.replaceAll(names,"Java","Python");
        System.out.println(names);
        System.out.println("======================frequency Method+================================");
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,20,20,10,10,30,40,50,50,60,50,50,60,50));
        int count50=Collections.frequency(list,50);
        System.out.println(list);
        System.out.println(count50);
        System.out.println("===============Find Unique element using frequency Method===============");
        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,20,10,10,30,40,50,50,60,50,50,60,50));
        for (Integer each:list1) {
            if(Collections.frequency(list1,each)==1){
                System.out.println(each);

            }

        }






    }
}
