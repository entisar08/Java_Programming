package day18_garbageCollector;

import java.sql.SQLOutput;
import java.util.Locale;

public class GarbageCollector {

    public static void main(String[] args) {
        String s1="Java";
        s1=null;//java will be available for Gc
        System.out.println(s1);
        System.out.println(s1.toLowerCase(Locale.ROOT));//null pointer exception
        String x;
        //System.out.println(x);
    }
}
