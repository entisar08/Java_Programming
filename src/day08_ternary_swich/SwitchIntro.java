package day08_ternary_swich;

public class SwitchIntro {
    public static void main(String[] args) {
        char grade='C';

        switch (grade){

            case 'A':
                System.out.println("Excelent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("not a grade");


        }
    }
}
