package day20_forEach;


import java.util.Arrays;

/*2. write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}
*/
public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};
        int[] merge=new int[6];
        /*for (int i = 0,j=arr1.length; i < merge.length; i++,j++) {
            merge[i]=arr1[i];
            merge[j]=arr2[i];

        }*/
        for (int i = 0; i < arr1.length; i++) {
            merge[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merge[i+arr1.length]=arr2[i];
        }
        System.out.println("merge = " + Arrays.toString(merge));



    }

}
