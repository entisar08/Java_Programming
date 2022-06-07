package day09_scanner;
/*
Create a class named CrewAndPassengers
		Given a number of people on the ship (int number)
		determine how many need to be crew members and how many can be passengers.
		Print how many of each type there should be.
                Total: 50  ====> 20 crew, 30 passengers
                Total: 75  ====> 25 crew, 50 passengers
                Total: 100 ====> 30 crew, 70 passengers
                Any other number of people on the ship is not valid
                Solution1: Use ternary. Do not use more than one println()
                Solution2: Use switch statement. Do not use more than one println()
 */
public class CrewAndPassengers {
    public static void main(String[] args) {
int number=50;
String result="";

switch(number) {
    case 50:
        result = "20 crew, 30 passengers";
        break;
    case 75:

        result = "25 crew, 50 passengers";
        break;

    case 100:
        result = "30 crew, 70 passengers";
        break;

    default:
        result = "invalid number";
}
        System.out.println(result);
        System.out.println("__________________________________________________");
        int number1=75;
        String result1= "";

        result1= (number1==50||number1==75||number1==100)?
                    (number1==50)? "20 crew, 30 passengers"
                   :(number1==75)?"25 crew, 50 passengers"
                    :"30 crew, 70 passengers"
                :"invalid ";
        System.out.println(result1);
    }
}
