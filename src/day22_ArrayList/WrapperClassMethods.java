package day22_ArrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

String str="20";
        System.out.println(str+1);//gonna print string in addition to 1

        //Integer num1=Integer.parseInt(str); //so Integer.pardeInt(str) this is int , now you assighned it to Integer
        //this is called unboxing
        int num1=Integer.parseInt(str);//this is int to int not autoboxing niether unboxing
Integer num2=Integer.valueOf(str); //valueOf return Integer class
        //to avoid autoboxing and unboxing assign parsed value to primitive ex int ,
        //and the return of valueOf to wrapper class ex Integer

    }
}
