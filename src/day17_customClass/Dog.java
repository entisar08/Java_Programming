package day17_customClass;

public class Dog {
    //no main method in thid kind of class.
public String name;//called instance it was created out of class and method..thhey dont have static keyword
public  String breed;
public String size;//clled istance variables
public  int age;
public char gender;
public  String color;

    public void setInfo(String name, String breed, String size, int age, char gender, String color) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.gender = gender;
        this.color = color;
    }

    //create methods called instance methods
    public  void eat(){// not static because static means only one
        System.out.println(name+"is eating");
    }
    public  void drink(){
        System.out.println(name+"is drinking water");
    }
//to avoid getting a hash code
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                '}';
    }
}
