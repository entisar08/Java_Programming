package day15_whileLoop;

public class RemoveDublicateUsingContinue {
    public static void main(String[] args) {

        String str= "kdjfksdfk";
        String result="";

        for (int i = 0; i <str.length() ; i++) {//iterate the string
            if(result.contains(str.charAt(i)+"")){
                continue;
            }
            result+=str.charAt(i);

            System.out.print(str.charAt(i));
           // if ()

        }
        String str1 = "xyzxyzxyz";

        String result1 = "";


        for (int i = 0; i < str1.length(); i++) {

            if( result1.contains( ""+str1.charAt(i) )){ // if the character is already contained in new string
                continue; // skip it
            }

            result1+= str1.charAt(i);

        }


        System.out.println(result1);

        System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyykykykykykykyykyk");






    }
}
