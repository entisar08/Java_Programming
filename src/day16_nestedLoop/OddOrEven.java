package day16_nestedLoop;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while(true){

            System.out.println("Enter a number:");
            int number = input.nextInt();

            if(number %2==0){
                System.out.println(number+" is an even number");
            }else{
                System.out.println(number+ " is an odd number");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            String answer = input.next().toLowerCase();

            while( !(answer.equals("yes") || answer.equals("no")) ){ // while the user provides invalid answer
                System.err.println("Invalid Entry! Would you like to enter another number? Yes/No");
                answer = input.next().toLowerCase();
            }

           if(answer.equals("no")){
               break;
           }
        }


/*Scanner input = new Scanner(System.in);

        String answer = "yes";

        while(answer.equals("yes")){// if you want to use condition in here you need to define anser before the while loop
//and set it to yes to make sure the while loop gets excuted
//also you will not need the no codition to break the loop
            System.out.println("Enter a number:");
            int number = input.nextInt();

            if(number %2==0){
                System.out.println(number+" is an even number");
            }else{
                System.out.println(number+ " is an odd number");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            answer = input.next().toLowerCase();

            while( !(answer.equals("yes") || answer.equals("no")) ){ // while the user provides invalid answer
                System.err.println("Invalid Entry! Would you like to enter another number? Yes/No");
                answer = input.next().toLowerCase();
            }


        }






    */



    }

}
