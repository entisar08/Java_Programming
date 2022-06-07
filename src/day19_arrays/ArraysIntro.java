package day19_arrays;
import java.util.Arrays;
public class ArraysIntro {
    public static void main(String[] args) {

        int[] scores=new int[5];//index numbers 0 - 4

scores[0]=87;
        scores[1]=76;
        scores[2]=90;
        scores[3]=98;
        scores[4]=87;



        //System.out.println(Arrays.toString(scores));
        System.out.println(scores[3]);
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);

        }

    }

}
