package day20_forEach;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int[] reverse=new int[array.length];

/*
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j]=array[i];
        }*/
        int j=0; //if you dont want to use j out of the for loop there is no need to decare it out of the for loop
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[j++]=array[i];
        }




        System.out.println(Arrays.toString(reverse));
    }
}
