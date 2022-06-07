package day09_scanner;

import java.util.Scanner;

public class ScanneIntro2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first decimal number:");

        float num = input.nextFloat();

        System.out.println("Enter your second decimal number:");
        double num2 = input.nextDouble();

        System.out.println("Enter your thidr number:");
        boolean num3 = input.nextBoolean();//input true or false

        System.out.println("num1=" + num);
        System.out.println("num2=" + num2);
        System.out.println("num3=" + num3);
        input.close();


    }
}
