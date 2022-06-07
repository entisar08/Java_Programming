package day05_arithmaticOperators;

import org.w3c.dom.ls.LSOutput;

public class OddOrEven {
    public static void main(String[] args) {


        double num = 5;
        boolean IsEven = num % 2 == 0;
        boolean IsOdd = num % 2 != 0;
        System.out.println("The number is : "+ num + "\n"+  "Is the number even: "+IsEven +"\n" + "Is the number odd :"+IsOdd);
    }
}
