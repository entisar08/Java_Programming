package day10_string;
/*1. Create a class named ShippingAddress and ask the user to:
	        1.1 Enter your full name ( nextLine() )
	        1.2 Enter your building number ( next() )
	        1.3 Enter your Street name ( nextLine() )
	        1.4 Enter your city name ( nextLine() )
	        1.5 Enter your state ( nextLine() )
	        1.6 Enter your zip code ( next() )

	        1.7 Display the shipping address
	                Ex:
	                    Your shipping address is:
	                        John Smith
	                        7925 Jones Branch Dr
	                        McLean, VA 22012*/
import java.util.Scanner;
public class ShippingAddress {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name : ");
        String fullName = input.nextLine();// it will take all the input
        System.out.println("Building Number : " );
        String BuildingNumber = input.next();// 66566+enter nextwill not read the enter from the keyboard
        input.nextLine();
        System.out.println("Street Name :" );
        String StreetName = input.nextLine();//there is Enter in the scanner  you shoud clear it by this command
        // note if you are using next??? finish it from lecturef
        System.out.println("input the city name:" );
        String CityName=input.nextLine();


        System.out.println("Enter your State naem:");
        String StateName=input.nextLine();


        System.out.println("enter your zip code:");
        String zipcode= input.nextLine();


        System.out.println("-------------------------------------------------");

        System.out.println("Your shipping address is :");

        System.out.println("\t"+fullName+"\n\t"+  BuildingNumber+" "+ StreetName+"\n\t"+ CityName+","+
                StateName+ " "+zipcode);

input.close();







    }
}
