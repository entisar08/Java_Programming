package day07_nestedIf;

public class GradeReport {

    public static void main(String[] args) {
         int score= 60;
         String  result="";

         if (score>=90){//this will be false if the grade is less than 90 and the excution
             // will move automatically to next condition
            result="your grade is :A";
        }
        else if (score>=80&&score<90){//so here there is no need to for <90
            result="your grade is :B";//
        }
        else if (score>=70&&score<80){// no need for <80 and so on
            result="your grade is :C";// to optimze your code you can include your grade is in the last print
        }
        else if (score>=60&&score<70){
            result="your grade is :D";
        }else{
            result="your grade is :F";
        }
        System.out.println(result);

    }
}
