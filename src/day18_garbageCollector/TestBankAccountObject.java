package day18_garbageCollector;

public class TestBankAccountObject {
    public static void main(String[] args) {

        BankAccount obj1=new BankAccount();
        obj1.setInfo("Gadir",123456789);
        System.out.println(obj1);
        obj1.checkBalance();
        obj1.deposit(1000);
        obj1.checkBalance();
        obj1.withdraw(300);
obj1.deposit(-700);

obj1.withdraw(5000);
        System.out.println("-==-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=");




    }

}
