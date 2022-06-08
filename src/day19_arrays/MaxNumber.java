package day19_arrays;

public class MaxNumber {
    public static void main(String[] args) {
int[] numbers={100,20,500,-10,30};
//int max=0;
        int max=numbers[0];
        for (int i =1; i < numbers.length; i++) {
            if( numbers[i]>=max){
                max=numbers[i];
            }

        }
        System.out.println(max);
    }
}
