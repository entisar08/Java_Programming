package day08_ternary_swich;
/*
1. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			anything else: print "Invalid floor - 6"
 */
// Instructor used if elseif else inside the the precoditioned if see the code at the end
public class ElevatorOptimized {
    public static void main(String[] args) {


        int floorNumber = 2;
        String result = "";

        if (floorNumber >= 1 && floorNumber <= 3) {
            result="Floor " + floorNumber + " selected." ;
            //"Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
            if (floorNumber == 1) {
                result += "Companies: Lobby, Verizon, Starbucks";
            }
            if (floorNumber == 2) {
                //"Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
                result += "Companies:Cydeo, NASA, Intelsat";
            }
                if (floorNumber == 3) {
                    //"Floor 3 selected. Companies: Lyft, BofA, Stake house"
                    result += "Companies:Lyft, BofA, Stake house";
                }

            } else {
                System.out.println("Invalid floor number");

            }
            System.out.println( result);


        }
    }
/*int floorNumber = 2;

        /*
        if(floorNumber >= 1 && floorNumber <= 3){
            if(floorNumber == 1){
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            }else if(floorNumber == 2){
                System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");
            }else{
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }
        }else{
            System.out.println("Invalid floor");
        }
/*
 String  result = "Invalid floor";


        if(floorNumber >= 1 && floorNumber <= 3){

                result = "Floor "+floorNumber+" is selected. Companies: ";

                if(floorNumber == 1){
                result += "Lobby, Verizon, Starbucks";
                }else if(floorNumber == 2){
                result += "Cydeo, NASA, Intelsat";
                }else{
                result += "Lyft, BofA, Stake house";
                }

                } else was removed to let the printer print the default message

                System.out.println(result);


*/
