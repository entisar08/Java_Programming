package day08_ternary_swich;

public class TernaryIntro3 {
    public static void main(String[] args) {
        //simple nested if example : pass or fail
        // but before that we need to check if the grade is valid\\
        int score = 120;
        //String result = "";//you dont have an initial value if you will assign a value to in the future
        String result;
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                result = "pass";
            } else {
                result = "fail";
            }
        } else {
            // System.out.println("invalid nuumber"); it is better to save the outbut in a varible then print it .
            result = "invalid number";
        }
        System.out.println(result);
        int score1=140;
        String result1="";
        result1=(score1 >= 0 && score1 <= 100)?(score1 >= 60)?"pass":"fail"

                : "invalid number";
        System.out.println(result1);
        System.out.println("========================================================");

        int n = 9;

        String day = (n >= 1 && n <= 7) ?
                (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday"
                        : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : "Sunday"
                : "No such a day";


        System.out.println(day);







    }
}
