package HomeWork;

public class LogicalOperators {

    public static void main(String[] args) {

        int a = 25;

        System.out.println(a<25&a<20); //returns false
        System.out.println(a<10||a<20); //returns false
        System.out.println(!(a<10&a<20)); //returns true
    }
}
