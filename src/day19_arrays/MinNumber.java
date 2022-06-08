package day19_arrays;

public class MinNumber {
    public static void main(String[] args) {
        int[] numbers={100,20,500,-10,30};
//int max=0;
        int min=numbers[0];
        for (int i =1; i < numbers.length; i++) {
            if( numbers[i]<min){
                min=numbers[i];
            }

        }
        System.out.println(min);
    }
    }

