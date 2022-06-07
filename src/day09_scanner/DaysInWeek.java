package day09_scanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//if you dont want to use the input more than once you can declare it as
        //new Scanner(System.in).nextInt(); the scanner will close imediately
        System.out.println("enter the day number:");
        int num = input.nextInt();
        String day = "Invalid";

        if (num >= 1 && num <= 7) {
            day = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" : (num == 4) ? "Thursday"
                    : (num == 5) ? "Friday" : (num == 6) ? "Saturday" : "Sunday";
        }
        System.out.println(day);
        input.close();
    }
}
