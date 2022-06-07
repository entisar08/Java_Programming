package day16_nestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {
           String str= "aaabbccccddeeeeff";//3l 3a 2k
           String result="";
        for (int j = 0; j <str.length() ; j++) {
            int count=0;
            char ch1=str.charAt(j);//l
            for (int i = 0; i < str.length(); i++) {
              if (ch1==str.charAt(i)){
                    count++;
                     }
            }
             if(!result.contains(""+ch1)) {
                  result += ch1 + "" + count + " ";
                 }
         }
        System.out.print(result);
        }
 }

