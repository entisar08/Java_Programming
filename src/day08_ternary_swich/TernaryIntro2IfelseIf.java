package day08_ternary_swich;

public class TernaryIntro2IfelseIf {
    public static void main(String[] args) {

        int number = 0;

        /*
        String result = "";
        if(number > 0){
            result = "Positive";
        }else if(number < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        */
        String result=(number > 0)? "positive" :( number <0)? "negative":"zero";//else if block have a sad face


        System.out.println("-=-=-=-=-=-=-=-=-=-=****************************");

        int n = 1;

        /*
        String day = "";
        if(n ==1){
            day = "Monday";
        }else if(n==2){
            day = "Tuesday";
        }else if(n==3){
            day = "Wednesday";
        }else if(n==4){
            day = "Thursday";
        }else if(n==5){
            day = "Friday";
        }else if(n==6){
            day = "Saturday";
        }else{
            day = "Sunday";
        }
    */
        String  day = (n==1)? "monday":(n==2)? "tuesday"
                :(n==3)?"wed":(n==4)?"thur":(n==5)?"fri":(n==6)?"sat": "sun";

        System.out.println(day);

        System.out.println("------------------------------------------");
        int  nn=4;
        String  mth = (nn==1)? "jan":(nn==2)? "feb"
                :(nn==3)?"mas":(nn==4)?"april":(nn==5)?"may":(nn==6)?"jun" :(nn==7)?"jul" :(nn==8)?"aug":(nn==9)? "sep"
               :( nn==10)?"sep":(nn==11)?"oct" :(nn==12)?"nov":"Dec";


        System.out.println(mth);




    }
}
