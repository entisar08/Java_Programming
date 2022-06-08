package day19_arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

/*5. AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number
*/
public class AverageNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//scanner object in the heap
        System.out.println("How many numbers you will enter");
        int n=input.nextInt();
        double[] numbers=new double[n];
        double sum=0.0;
        double average=0.0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number");
            numbers[i]=input.nextDouble();
            sum+=numbers[i];
            //if you strated with integer numbers the average will be integer to force it to be exact cast total to double
            //  double average = sum / (double)total; total is n in my code
        }
        DecimalFormat df=new DecimalFormat("0.000");
        average=sum/n;

        System.out.println("Average="+df.format(average));



    }
}
