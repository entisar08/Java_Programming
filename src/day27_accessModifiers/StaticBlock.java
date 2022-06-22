package day27_accessModifiers;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }

    static{//static initialization block
        System.out.println("Static Block");//excuted first
    }
}
