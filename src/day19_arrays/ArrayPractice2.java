package day19_arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        int[] arr1=new int[100];
        System.out.println("arr1 = " + Arrays.toString(arr1));
        for (int i = 0,j=1;i < arr1.length; i++,j++) {
            arr1[i]=j;
//or regular for loop with arr1[i]=i+1;
        }
        System.out.println("arr1 = " + Arrays.toString(arr1));


        System.out.println("===============================================");
        int[] arr2=new int[100];

        for (int i = arr2.length - 1,j=1; i >= 0; i--,j++) {

            arr2[i]=j;


        }
        System.out.println("arr1 = " + Arrays.toString(arr2));


    }
}
