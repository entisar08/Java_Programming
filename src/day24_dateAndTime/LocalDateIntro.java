package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
        System.out.println("+++++++++++++++now() method++++++++++++++");
        LocalDate today= LocalDate.now(); // so we call static method by calling it from the class
        System.out.println(today);

        System.out.println("+++++++++++++++of() method++++++++++++++");
        LocalDate birthDay=LocalDate.of(2000,5,25);//provided by numbers
        System.out.println(birthDay);
        System.out.println("==========================LocalDate methods=============================");
        System.out.println(today.getYear());//.getYear
        System.out.println(today.getMonth());//.getMonth
        System.out.println(today.getMonthValue());//.getMonth
        System.out.println(today.getDayOfYear());//.getDayOfYear()
        System.out.println(today.getDayOfWeek());//.getDayOfWeek()
        System.out.println("==========================LocalDate Diffrent set of methods=============================");
        System.out.println(today.plusYears(2));
        today=today.plusYears(2);
        System.out.println(today);
        System.out.println("==========================LocalDate Diffrent set of methods=============================");
        LocalDate graduationDate=LocalDate.of(2023,2,23);
        graduationDate.plusYears(2);
        System.out.println("graduationDate = " + graduationDate);
        graduationDate=graduationDate.plusYears(3);
        System.out.println("graduationDate = " + graduationDate);
        graduationDate=graduationDate.plusMonths(7);
        System.out.println("graduationDate = " + graduationDate);
        graduationDate=graduationDate.plusWeeks(7);
        System.out.println("graduationDate = " + graduationDate);
        graduationDate = graduationDate.plusDays(100);

        System.out.println(graduationDate);

        System.out.println("--------------------------------------------");

        LocalDate yourBirthDay = LocalDate.of(2005, 4, 1);
        LocalDate yourBrotherBirthDay = yourBirthDay.minusYears(2).minusMonths(3);

        System.out.println(yourBirthDay);
        System.out.println(yourBrotherBirthDay);

        System.out.println("--------------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994, 7, 7);
        LocalDate birthday2 = LocalDate.of(1994, 7, 7);

        boolean r1 = birthday1.isEqual(birthday2);//year month day should be the same

        System.out.println(r1);


        System.out.println("--------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023, 1, 1);

        System.out.println(  grad_date.isBefore(  LocalDate.of(2022, 12, 31) ));
        System.out.println(  grad_date.isAfter(  LocalDate.of(2022, 12, 31) ));

        System.out.println("----------------------------------------------");

        System.out.println(  LocalDate.of(2022, 6, 16).isLeapYear()  );






    }
}
