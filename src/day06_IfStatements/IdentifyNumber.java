package day06_IfStatements;

public class IdentifyNumber {
    public static void main(String[] args) {

int number= 22;
boolean IsPositive= number > 0;//retrun true if the number is positive
boolean IsNegative=number <0;
        boolean IsZero=number ==0;
//boolean IsZero= !IsNegative&&!IsPositive;
        System.out.println(" the Number :" + number + "is " +IsPositive);
        System.out.println(" the Number :" + number + "is " +IsNegative);
        System.out.println(" the Number :" + number + "is " +IsZero);

    }
}

/*2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false*/