package day10_string;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilewithScanner {
    public static void main(String[] args) throws IOException {
        Scanner scan= new Scanner(Path.of("src/day10_string/Test.txt"));//the parenthesis indicate the constructor
//the of method of the path
//compile error called exception

        /*System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());*/

        String str1= scan.next();
        System.out.println("str1 ="+str1);
        //scan.nextLine();
        String str2=scan.nextLine();
        System.out.println("str2 ="+str2);
        System.out.println(scan.nextLine());
       System.out.println(scan.next());
        System.out.println(scan.next());



        scan.close();




    }
}
