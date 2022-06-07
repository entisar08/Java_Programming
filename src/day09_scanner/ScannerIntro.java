package day09_scanner;
import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
Scanner input= new Scanner(System.in);//this creats scanner object called reference name
//for reading user input.short Scan and the IDE will import the scanner
        //if you wanna call a method you call it from the Scanner object you created
        // input.nextByte();this will ask for data from the user but you need tostore to be reusable
        System.out.println("Enter your first number :");
        byte num1=input.nextByte();//this will wait for user entry
        System.out.println("you entered this number :"+num1);
        System.out.println("Enter your second number :");
        int num2=input.nextInt();
        System.out.println("you entered this number :"+num2);
        input.close();






    }
}
