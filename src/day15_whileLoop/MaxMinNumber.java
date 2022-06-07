package day15_whileLoop;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int max= -2147483648;//assign the smallest number to make sure any number will be entered greater the the max
        int min=2147483647;// give me the largest default number,thid will be gone righ
        // t after excuting the first number

        for (int i = 0; i <5 ; i++) {

            int num=input.nextInt();
            if(num>max){// make sure you have 2 seprate conditions
                max=num;
            }
            if (num<min) {
                min = num;
            }
        }
        System.out.println("the max number is:"+ max+ "\nthe min number is :"+min);








    }
}
