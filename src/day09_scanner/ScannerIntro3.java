package day09_scanner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);//we are trying to do boolean
        System.out.println("enter a character: ");
        char ch=input.next().charAt(0);//next return string only
        System.out.println("you entered "+ch);
        System.out.println("would you like to continue :");
        String answer=input.next();//next reads the input only untill space
        System.out.println("you entered "+answer);


input.close();
    }
}
