package day08_ternary_swich;

public class IfStatementAndTernariesPractice {
    public static void main(String[] args) {
        int score = 90;
// here we are mixing if staement and ternary tohgather to shortern the code
        String result = "";

        if (score >= 0 && score <= 100) {

            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";

        } else {
            result = "Invalid Score";
        }

        System.out.println(result);

        System.out.println("---------------------------------");

        String result2 = (score >= 0 && score <= 100) ?
                (score >= 90) ? "A"
                        : (score >= 80) ? "B"
                        : (score >= 70) ? "C"
                        : (score >= 60) ? "D" : "F"
                : "Invalid Score";

        System.out.println(result2);



    }
}
