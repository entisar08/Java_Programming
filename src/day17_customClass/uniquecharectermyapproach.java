package day17_customClass;

public class uniquecharectermyapproach {
    public static void main(String[] args) {

        String str="breadjambread";
        // b r e a d     j a m     b r e   a  d
        //0  1 2 3 4     5 6 7     8 9 10 11  12
int b=str.indexOf("bread");//this will give you the index of first letter of the word bread
int l=str.lastIndexOf("bread");//this will give the index of the first letter of second bread word
        //to extract the jam you can select the substring betwwen
      String middle=str.substring(b+5, l);


        System.out.println(middle);

    }
}
