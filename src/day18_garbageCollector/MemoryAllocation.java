package day18_garbageCollector;


import day17_customClass.Employee;

class Car{
    public String brand;
    public String model;
    public String color;
    public int year;// default of integer 0
}



public class MemoryAllocation {
    public static void main(String[] args) {// all methods allocted in the stack
        int a =100;

        Car car1=new Car();
//          stack     heap , for the object in the heap since it is not initialized its default is null



        System.out.println("-----------------------------------------");

        Employee employee1 = new Employee();
        Employee employee2 = employee1;

        employee1.setInfo("Rehane", 30, 'F', "Java Developer",95000, "A12");

        System.out.println(employee1);
        System.out.println(employee2);


        System.out.println("-----------------------------------------");

        String batch1 = new String("Java");
        String batch2 = batch1;
        String batch3 = batch1;
          }


    public static void method1(){   int b =100; // locAL  variable in the stack
         }
    public static void method2( ){
        String c="Hello world"; //string object in string pool in the heap   c in the stack it is called refrence object
         String d=new String("Hello wowrld" );
         //     d refrence in the stack   object in the heap
       }
    public static void method3(){   }




}
