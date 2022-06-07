package day13_;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        String result = "Number of letter";
        System.out.println("Word:");
        String str = input.nextLine().toLowerCase();

        System.out.println("Letter:");
        char letter = input.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (letter == str.charAt(i)) {
                num++;
            }
        }

        System.out.println(num);


    }
}
