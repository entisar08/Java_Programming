package day11_string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
String correctUserName= "Cydeo";//literal in string pool
String correctPasswor= "WoodenSpoon";//literal in string pool
Scanner input= new Scanner(System.in);

        System.out.println("Enter User name:");//in the heap
        String UN=input.nextLine();
        System.out.println("Enter Password:");// in the heap
        String Pw=input.nextLine();
        input.close();
        if (UN.equals(correctUserName)&&Pw.equals(correctPasswor)){
            System.out.println("You can Log in");
        }else{
            System.out.println("User name or passwrd wrong");
        }






    }
}
