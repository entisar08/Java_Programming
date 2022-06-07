package day11_string;
/*
1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string,
			        if both have the same number of characters then print "Equal"
 */
import java.sql.SQLOutput;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter string 1");
        String str1=scan.nextLine();
        System.out.println("enter string 2");
        String str2=scan.nextLine();
         int l_str1=str1.length();
         int l_str2=str2.length();
         if (l_str1>l_str2){
             System.out.println("String1 is the longest");
         }else if (l_str1==l_str2) {

             System.out.println("Str1 is equal to str2");
         }else{
             System.out.println("String2 is the longest");
         }
scan.close();


    }
}
