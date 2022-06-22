package day27_accessModifiers;

public class TestCircleObject {
    public static void main(String[] args) {
        Circle circle1= new Circle(4.3);
        Circle circle2= new Circle(5.3);
        Circle circle3= new Circle(6.3);



        System.out.println("circle1 = " + circle1);
        System.out.println("circle2 = " + circle2);
        System.out.println("circle3 = " + circle3);

        /*
        System.out.println(circle1.pi);
        System.out.println(circle2.pi);
        System.out.println(circle3.pi);
        */

        System.out.println(Circle.pi);
        // System.out.println(Circle.radius);



    }
}
