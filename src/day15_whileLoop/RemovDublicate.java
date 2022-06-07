package day15_whileLoop;

import java.util.Scanner;

public class RemovDublicate {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str="aaaabbcc";//once you create a string itis  immutable you need to create another container
        String result="";//check if the letter is in the string first to avoid dublicate
        for (int i = 0; i <str.length() ; i++) {      // System.out.println(str.charAt(i)); to test the output and if the the loop will read all the letters
            if(!result.contains(str.charAt(i)+"")){// contains give boolean that how you reverse it
                result+=str.charAt(i)+"";
            }


        }
        System.out.println(result);


    }
}
