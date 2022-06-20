package day25_constructors;

public class ConstructorsIntro {
//define constructor :name same class name. no rturn type
    public ConstructorsIntro (){
        System.out.println("Object is created by using default constructon");

    }
    public ConstructorsIntro (int a){
        System.out.println("Object is created by using Parameterized  constructor");

    }
    public  void add(){

    }


   public static void main(String[] args) {
     ConstructorsIntro obj1=   new ConstructorsIntro();
     ConstructorsIntro obj2=   new ConstructorsIntro(3);
     ConstructorsIntro obj3=   new ConstructorsIntro(5);//each object has own memory


   }
}
