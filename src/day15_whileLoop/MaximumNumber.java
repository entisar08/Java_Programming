package day15_whileLoop;


import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //  need the scanner to be  in the loop to ask the user
        //initialize the max
        //int max=0; you cant initialize an int so check google for the minimum number in java
        //con
        int max=-2147483648;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter number:");
            int num=input.nextInt();
            if (num>=max){
                max=num;

            }
           // System.out.println("the maximum number= "+max);

        }
        System.out.println("the maximum number= "+max);
    }
}
