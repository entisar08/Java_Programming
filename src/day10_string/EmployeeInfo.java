package day10_string;

import java.util.Scanner;

public class EmployeeInfo {
    /*2. Create a class named EmployeeInfo and Ask the user to:
                2.1 Enter your full name
                2.2 Enter your age
                2.3 Enter your gender
                2.4 Enter your company name
                2.5 Enter your job title
                2.6 Enter your salary

                Display:
                    Employee's name
                    EMployee's age
                    Employee's gender next().charAt(0)
                    Company name
                    Employee's job title
                    Employee's salary
    */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name : ");
        String fullName = input.nextLine();

        System.out.println("Enter your age : ");
        byte Age = input.nextByte();

        System.out.println("Enter the gender :");
        char gender = input.next().charAt(0);

        input.nextLine();

        System.out.println("Enter Your company name:");
        String CompanyName = input.nextLine();


        System.out.println("Enter yourJob  title:");
        String JobTitle = input.nextLine();


        System.out.println("enter your Salary:");
        double Salary = input.nextDouble();


        System.out.println("-------------------------------------------------");

        System.out.println("\t"+ fullName+"\n\t"+Age+"\n\t"+gender+"\n\t"+CompanyName+"\n\t"+JobTitle+"\n\t"+Salary );

    }
}
