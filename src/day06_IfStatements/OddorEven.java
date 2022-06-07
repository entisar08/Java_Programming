package day06_IfStatements;

public class OddorEven {
    public static void main(String[] args) {

        int number = 45;
        boolean IsEven = number % 2 == 0;
//boolean IsOdd= number%2 != 0;
        boolean isOdd = !IsEven;//another way to write is odd, if the numver is not even itts odd
        System.out.println(number+ " is even: " + IsEven);
        System.out.println(number+ " is odd: " + isOdd);


    }
}
/* Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
*/