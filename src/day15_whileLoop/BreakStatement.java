package day15_whileLoop;

public class BreakStatement {
    public static void main(String[] args) {//say i dont to change the main loop condition but i want to break at 6
        //you can create condition to use brak statement
        for (int i = 0; i <10 ; i++) {
            if(i==6){
                break;
            }
            System.out.println(i);
        }
        System.out.println("8888888888888888888888888888888888888888888888888888888");
        for (char i='A';i<='Z';i++) {

            System.out.print( "  "+i);
            if(i=='J'){
                break;
            }
            
        }
         

    }
}
//when you give terminate the loop make sure yu put after everything because any statement after the break un reachable