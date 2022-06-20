package day19_arrays;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {
        String[] myGroup=new String[5];
        myGroup[0]="James";
        myGroup[1]="sofghmia";
        myGroup[2]="somfghia";
        myGroup[3]="sovvmia";
        //myGroup[4]="svvvomia";
        myGroup[myGroup.length-1]="Aseel";
        System.out.println(Arrays.toString(myGroup));
        //to update an array element you can access it and then reassign
        //print array in reversed order
        for (int i = myGroup.length-1; i >=0; i--) {
            System.out.println(myGroup[i]);
            }
        for (int i = 0; i < myGroup.length; i++) {//mygroup.fori loop forward}
            System.out.println(myGroup[i]);
        }
        // mygrouop.forr loop in reverse
        for (int i = myGroup.length - 1; i >= 0; i--) System.out.println("");

        int[] counter=new int[100];
        for (int i = 0,j=1; i < counter.length; i++,j++) {
            counter[i]=j;
        }
        int[] revCounter=new int[100];
        for (int i = revCounter.length-1; i >= 0; i--) {
            revCounter[revCounter.length-1-i]=i;
        }
        System.out.println(Arrays.toString(counter));
        System.out.println(Arrays.toString(revCounter));
        }

    }


