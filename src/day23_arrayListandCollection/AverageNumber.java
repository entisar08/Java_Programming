package day23_arrayListandCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(20,30,40,50,60,70,80));
        System.out.println(list);

        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        double average = sum / (double)list.size();

        System.out.println("average = " + average);





    }
}
/*2. Write a program that can find the average number from an arrayList of integers*/