package day13_;

import java.util.Scanner;
public class reverseit {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String  word1="";
        //WRITE YOUR CODE BELOW
        int len=word.length();
        System.out.println(len);
        if (word.length()==5){
            //reverse it
            for(int i=len-1;i>=0;i--){
                word1+=word.charAt(i);
                System.out.println(i);
            }
            System.out.println(word1);
        }

        else if (word.length()>5){
            System.out.println("Too long!");
        }else{
            System.out.println("Too short!");
        }
    }
}
