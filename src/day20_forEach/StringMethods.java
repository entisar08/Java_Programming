package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
      //toCharArray


        String str="Cydeo School";//input string output char array

       //char[] chArray= new char[str.length()];

        char[] chArray1= str.toCharArray();
        char[] chArray2= str.replace(" ","").toCharArray();
               System.out.println(Arrays.toString(chArray1));
               System.out.println(Arrays.toString(chArray2));

        System.out.println("============================================================");
//split :input char or String no index number
        String str2="Today is a great day to learn java";
        String[] strArray1=str2.split(" ");//split the sentence using space or any char means split whenever you see a space
        String[] strArray2=str2.split("great ");//split by a word great is the spliting point it wont be included
        System.out.println(Arrays.toString(strArray1));
        System.out.println(Arrays.toString(strArray2));

        System.out.println("==================z===============z==============z===========");
// how to reverse a sentence by words
// first split using space then then apply reverse array method from array utility then concatenate using for loop
        String sentence="I love Java";
        String revSen="";
       String[] transArray= sentence.split(" ");
        String[] transArray1= ArraysUtility.reverse(transArray);
        for (int i = 0; i < transArray1.length; i++) {
             revSen+=transArray1[i]+" ";

        }
        System.out.println(Arrays.toString(transArray1));
        System.out.println(revSen);
    }

}
