package day27_accessModifiers;

public class InstanceInitializationBlock {
    public  String name;
    public int age;

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        InstanceInitializationBlock obj1= new InstanceInitializationBlock("James", 25);
        InstanceInitializationBlock obj2= new InstanceInitializationBlock("Aron",34);
        System.out.println(obj1.name);
        System.out.println(obj2.name);


    }
}
