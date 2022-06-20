package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {
    public static void main(String[] args) {
        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 6, 25));
        people[1].setInfo("Baniel", 'F', LocalDate.of(1979, 9, 5));
        people[2].setInfo("Kaniel", 'M', LocalDate.of(1977, 9, 3));
        people[3].setInfo("vaniel", 'F', LocalDate.of(1988, 4, 2));
        people[4].setInfo("ganiel", 'F', LocalDate.of(1969, 3, 24));



        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll( Arrays.asList(people) );

        // print name & date of birth of each person object
        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println(studentsList.get(i).name+ " "+studentsList.get(i).dateOfBirth);

        }

        // remove all the person object that has the age > 55
        studentsList.removeIf(p-> p.age>55);
        System.out.println(studentsList);
    }
}
