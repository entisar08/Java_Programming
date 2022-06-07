package day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int min= 2147483647;//alll numbers will be less than this by default
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num=input.nextInt();
            if(num<min){// if the user entered entry is less than the current minimum that we have

                min=num;//then user entered number should be the minimum number
            }

        }
        System.out.println("the minimum number is :"+min);
        input.close();
    }
}
