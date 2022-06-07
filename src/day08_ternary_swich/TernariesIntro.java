package day08_ternary_swich;

public class TernariesIntro {
    public static void main(String[] args) {


        int score= 85;
        String result= "";
         if(score>= 60){ result= "Passed";}
         else{result= "Failed";}
        System.out.println(result);

         result=(score>= 60)? "Passed": "Failed";
        System.out.println("---------------------------------");

        int age= 20;

        String result2="";
        if (age>= 21) {
            result2= "eligible";
    }else{
            result2="not eligible";



        }
        System.out.println(result2);
        System.out.println("--------------------------------------------------------");
        String result3= (age>= 21)? "eligible":"not eligible";
        System.out.println(result3);

    }
}
