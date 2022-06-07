package day06_IfStatements;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(true==!false); //the not will be executed first cause it has a big periotiy
        System.out.println(10>9 ==8<7 && "Java"=="Python"|| 'a'=='A'); //evaluate the sides of the and logical first
                        //true     false     false
                        //   flase
    }
}
