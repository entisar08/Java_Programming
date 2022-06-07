package day13_;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first number:");
        double num1=scan.nextDouble();
        System.out.println("Enter your second number:");
        double num2=scan.nextDouble();
        System.out.println("Enter operation:");
        char operator=scan.next().charAt(0);
         calc(num1,num2,operator);




    }

    public static void calc(double num1,double num2,char mathOperator  ){


       /* long result= num1+num2;

        long result=num1+*/
    }

}
