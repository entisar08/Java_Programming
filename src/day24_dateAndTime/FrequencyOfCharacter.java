package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

String str="aaaaaabbbbaaajjkkkk";//frequency can only applied to Collections
        String result="";//we can create array from string then convert array to arraylist
       String[]str1=str.split("");
      //  System.out.println(Arrays.toString(str1));
        for (String s : str1) {
            int count=Collections.frequency(Arrays.asList(str1),s);
            if(!result.contains(s)){
                result+=s+count;
            }
        }
        System.out.println(result);


    }
}
