package day18_garbageCollector;

public class TestPizzaObject {

    public static void main(String[] args) {
       Pizza pizza1 =new Pizza();
       //call the
        pizza1.size='L';

        Pizza pizza2 =new Pizza();
        //call the
        pizza1.size='M';
        pizza2.setInfo('s',1,2);
        System.out.println(pizza1);
        System.out.println(pizza2);
//you can call the tostring method but it is unnesessary

        System.out.println("=========================================================");
        double total = 0;
        for (int i = 0; i < 20; i++) {
            Pizza small=new Pizza();
            small.setInfo('s',2, 2);
            total += small.calcCost();
            Pizza medium= new Pizza();
            medium.setInfo('M',3,4);
            total += medium.calcCost();
            Pizza large =new Pizza();
            large.setInfo('L',4,5);
            total += large.calcCost();

        }
        System.out.println("total price : "+total);

    }
}
