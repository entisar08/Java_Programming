package day17_customClass;

public class TestDogObject {
    public static void main (String[] args) {
       //new dog(); //to make reusable assign it to a variable
        Dog dog1= new Dog();
        //dot operator allows you to use instance variable and instance methods
dog1.name="max";
dog1.breed="Husky";
dog1.gender='M';
dog1.age=4;
    dog1.size="large";
    dog1.eat();//if you didnt declare a name it will ser the default which is null.
        System.out.println(dog1);



    }
}
