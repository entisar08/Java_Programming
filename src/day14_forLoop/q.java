package day14_forLoop;
import java.util.Scanner;
public class q {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        String result=""+word.charAt(0);
        for (int i = 0; i <word.length() -1; i++) {
             if(word.charAt(i)!=word.charAt(i+1)){
              result+=word.charAt(i+1);
                }
             }
        System.out.println(result);

        }

    }

/*
*  Write a program that can remove the duplicated characters from the a string

                Ex:
                    str = "aabbbcccc"

                    output:
                        abc*/