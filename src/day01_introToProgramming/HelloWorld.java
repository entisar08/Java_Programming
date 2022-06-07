package day01_introToProgramming;

public class HelloWorld {
    public static void main(String[] args) {

        int n1 = 3;
        int n2 = 5;
        int n3 = -40;
        String result = (n1 > n2 && n1 > n3)?"n1 is bigger" :(n2 > n1 && n2 >n3)?
                "n2 is bigger" :(n3 >n1 && n3 > n2)? "n3 is bigger" :
                "Invalid";
        System.out.println(result + n2);
    }


}
