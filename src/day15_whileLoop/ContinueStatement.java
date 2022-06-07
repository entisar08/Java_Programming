package day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {//what ever comes after it will be skipped for that iteration
            if (i==4){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("0000000000000000000000000000000000000000000");
        for (int i = 10; i < 21; i++) {
            if (i%2==0){
                continue;
            }
            System.out.println(i);

        }
        for (char i = 'A'; i < 'G'; i++) {
            if(i=='B'||i=='E'){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("777777777777777777777777777777");

        // find the sum of all the even number between 50 ~ 100

        for (int i = 50; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i +" ");
            }
        }

        System.out.println();


        //50, 52, 54, 56 ...... 100
        for (int i = 50; i < 101; i += 2) {//change the increment
            System.out.print(i+" ");
        }

        System.out.println();


        for (int i = 50; i < 101; i++) {
            if (i % 2 != 0){ // if the i's value is odd number
                continue; // skip it
            }

            System.out.print(i+" ");

        }

        System.out.println();












        }




    }


