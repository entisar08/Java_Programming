package day15_whileLoop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");
        int age =input.nextInt();

        //if user entered invalid entry repeat please reenter
        while(!(age>=1 &&age<=120)){
            System.out.println("Please renter valid age");
             age=input.nextInt();
        }
        if(age>=21){
            System.out.println("Elligible");
        }else{
            System.out.println("Not Eligible");
        }

    }
}
