package day22_ArrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);//0
        numbers.add(200);//1
        numbers.add(300);//2
        numbers.add(400);//3
        numbers.add(500);//4
        numbers.add(3, 255);
        System.out.println(numbers); //{100, 200, 300, 255, 400, 500}

        // numbers.add(8, 2000);// give outof bound warning

        System.out.println(numbers); //{100, 200, 300, 255, 400, 500}

        System.out.println("-------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-------------------------------------------");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-------------------------------------------");

        for (Integer each : numbers) {
            System.out.println(each);
        }




    }
}















//





