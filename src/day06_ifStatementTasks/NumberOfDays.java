package day06_ifStatementTasks;

public class NumberOfDays {
    public static void main(String[] args) {
        int month= 2;
        boolean has28day= month ==2;
        boolean has30days=(month== 4||month== 6||month== 9||month== 1);
        if(has28day){
            int NumOfDays = 28;
            System.out.println("Number of days in the given month is : \n" + NumOfDays);
        }
        if (has30days) {
            int NumOfDays = 30;
            System.out.println("Number of days in the given month is : \n" + NumOfDays);
        }
        if(!has28day&&has30days){
             int NumOfDays =31;
                System.out.println("Number of days in the given month is : \n"+ NumOfDays);

            }

        }


    }

