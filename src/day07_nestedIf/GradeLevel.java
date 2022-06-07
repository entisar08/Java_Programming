package day07_nestedIf;

public class GradeLevel {
    public static void main(String[] args) {
        int gradeLevel = 6;
        
        String result= "the grade level is:";
        if (gradeLevel<=5){// you can simplify by emitting the first condition cause it is always true
            result="Elementary School";
        }
        else if (gradeLevel<=8){//so here there is no need to for <90
            result=" Middle school";//
        }
        else if (gradeLevel>=9&&gradeLevel<=12){// no need for <80 and so on
            result="High School";// to optimze your code you can include your grade is in the last print
        }
        else if (gradeLevel>=13&&gradeLevel<=16){
            result="College";
        }
        else if (gradeLevel>=17&&gradeLevel<=18) {
            result = "Grad School";
        }else {
            result="Not exist ";
        }
        System.out.println("The grade Level is : \n\t\t\t\t" +result );

    



    }
}
/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a program to determine and print which school type someone is in.
	Ex:
		gradeLevel = 2
	     output:
		Elementary School
    The grade level and types are:
	1 ~ 5: Elementary school
	6 ~ 8: Middle school
	9 ~ 12: High school
	13 ~ 16: College
	17 ~ 18: Grad School
      Note: Assume that the given number is between 1 ~ 18
 */