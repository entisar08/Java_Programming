package day07_nestedIf;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        String order = "";
        //preconditining :
        if (size =="tall"||size =="grande"||size =="venti") {                //main if statement
            if (size == "tall") {                                             // child if statement
                order = size + ":\n" + "\t\t\t\tprice is $3.69\n" + "\t\t\t\t90 calories";
            }
            if (size == "grande") {
                order = size + ":\n" + "\t\t\t\tprice is $3.99\n" + "\t\t\t\t120 calories";
            }

            if (size == "venti") {
                order = size + ":\n" + "\t\t\t\tprice is $4.29\n" + "\t\t\t\t150 calories";
            }
            System.out.println(order);
        }else{
            System.out.println("Invalid Size");
        }
    }
  }




/*Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"

			Note: MUST use nested if
*/
