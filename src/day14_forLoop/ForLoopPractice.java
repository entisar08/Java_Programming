package day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for( int i = 10;  i >= 5; i--){ // i: 10, 9, 8, 7, 6, 5, 4
            System.out.println("Hello Cydeo "+ i); // 1, 2, 3, 4, 5, 6
        }
        System.out.println("--------------------1----------------------");
        // sum of all the numbers 1 ~ 100

        int sum = 0;

        for(int i = 1; i <= 100; i++ ){
            sum += i;
        }

        System.out.println(sum);
        System.out.println("------------------2----------------------");
        // print all the alphabet letters A ~ Z

        for(char i = 'A';  i <= 'Z'; i++){
            System.out.print(i +" ");//he used print here to not print in new line and he added space in between

        }
        System.out.println("------------------3---------------------");
        System.out.println();//if you used println after print it will print in the same line
        //you can clear that by additional empty println

        System.out.println("Cydeo");
        for(char i = 'Z';  i >= 'A'; i--){
            System.out.print(i +" ");//he used print here to not print in new line and he added space in between

        }

    }
}
